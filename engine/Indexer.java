import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.URL;
import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.JSONObject;
/**
 * Write a description of class Indexer here.
 *-
 * @author (your name)
 * @version (a version number or a date)
 */
public class Indexer
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        try{

            BufferedReader reader = new BufferedReader(new FileReader("crawled.txt"));
            String line = "";
            FileWriter out = new FileWriter("output.json");

            try{
                while (line != null) {
                    System.out.println(line);
                    // read next line
                    line = reader.readLine();
                }
                String rawHTML = "";
                URL url = new URL(line);
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
                
                
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("url", line);
                jsonObject.put("words", populate(rawHTML).keySet());
                
                out.write(jsonObject.toJSONString());
                
            } catch (Exception e){
                e.printStackTrace();
            }
            out.close();
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Map<String, Integer> populate(String text){

        int mostFrequentWordsNumber = 5;
        Map<String, Integer> mapOfFrequentWords = new TreeMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (!mapOfFrequentWords.containsKey(word)) {
                mapOfFrequentWords.put(word, 1);
            } else {
                mapOfFrequentWords.put(word, mapOfFrequentWords.get(word) + 1);
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
