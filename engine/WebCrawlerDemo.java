import java.io.IOException;
import java.io.File;

/**
 * Write a description of class WebCrawlerDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WebCrawlerDemo
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        
        try {
          File myObj = new File("crawled.txt");
          if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
          } else {
            System.out.println("File already exists.");
          }
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
        WebCrawler crawler = new WebCrawler();
        String rootURL = "https://www.section.io/engineering-education/springboot-antmatchers/";
        crawler.crawl(rootURL, 100);
    }   
}
