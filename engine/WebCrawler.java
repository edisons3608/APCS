import java.util.*;
import java.net.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.util.stream.Collectors;
/**
 * Write a description of class WebCrawler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WebCrawler
{
    // instance variables - replace the example below with your own
    private Queue<String> urlQueue;
    private List<String> visitedURLs;

    public WebCrawler() {
        urlQueue = new LinkedList<>();
        visitedURLs = new ArrayList<>();
    }
    
    public void crawl(String rootURL,int breakpoint){
        urlQueue.add(rootURL);
        visitedURLs.add(rootURL);
         
        while(!urlQueue.isEmpty()){
            
            String s = urlQueue.remove();
            //System.out.println(s);
            String rawHTML = "";
            
            try{
                URL url = new URL(s);
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                String inputLine = in.readLine();

                // read every line of the HTML content in the URL
                // and concat each line to the rawHTML string until every line is read.
                while(inputLine  != null){
                    //System.out.println(inputLine);
                    rawHTML += inputLine;

                    inputLine = in.readLine();
                }
                in.close();
                
            } catch (Exception e){
                e.printStackTrace();
            }
            
            
            String urlPattern = "\\b((?:https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:, .;]*[-a-zA-Z0-9+&@#/%=~_|])";
            Pattern pattern = Pattern.compile(urlPattern);
            Matcher matcher = pattern.matcher(rawHTML);
    
            // Each time the regex matches a URL in the HTML,
            // add it to the queue for the next traverse and the list of visited URLs.
            breakpoint = getBreakpoint(breakpoint, matcher,rawHTML);
    
            // exit the outermost loop if it reaches the breakpoint.
            if(breakpoint == 0){
                break;
            }
        }
    }
    private int getBreakpoint(int breakpoint, Matcher matcher,String rawHTML) {
        while(matcher.find()){
            String origURL = matcher.group();
            String actualURL = "";
            for(int x = 0;x<origURL.length();x++){
                if(origURL.substring(x,x+1).equals("\"") || origURL.substring(x,x+1).equals("<")){
                    break;
                }else{
                    actualURL += origURL.substring(x,x+1);
                }
            }

            
            if(!visitedURLs.contains(actualURL)){
                visitedURLs.add(actualURL);
                System.out.println("Website found with URL " + actualURL);
                urlQueue.add(actualURL);
                
                try {
                    FileWriter out = new FileWriter("output.json");
                    
                    
                    JSONArray jsonArray = new JSONArray();
                    JSONObject jsondict = new JSONObject();
                    jsondict.put("url", actualURL);
                    jsondict.put("words", populate(rawHTML).keySet());
                    jsonArray.add(jsondict);
                    out.append(jsonArray.toJSONString());
                    out.flush();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
    
            // exit the loop if it reaches the breakpoint.
            if(breakpoint == 0){
                break;
            }
            breakpoint--;
        }
        return breakpoint;
    }
    public Map<String, Integer> populate(String text){

        int mostFrequentWordsNumber = 5;
        Map<String, Integer> mapOfFrequentWords = new TreeMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            
            if(!word.contains("<") && !word.contains(">")){
                if (!mapOfFrequentWords.containsKey(word)) {
                mapOfFrequentWords.put(word, 1);
                } else {
                    mapOfFrequentWords.put(word, mapOfFrequentWords.get(word) + 1);
                }
            }
            
        }

        Map<String, Integer> sorted = mapOfFrequentWords
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(mostFrequentWordsNumber)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                    LinkedHashMap::new));
        return sorted;
    }
    
    
    
        
        
        
    
    
}
