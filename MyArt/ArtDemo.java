import java.awt.Color;
/**
 * RandomArt Demo - has examples of things your might use for your MyArt class
 * 
 */
public class ArtDemo
{
    private Picture image;

    public ArtDemo()
    {
        final int WIDTH = 100;
        final int HEIGHT = 100;

        image = new Picture(WIDTH, HEIGHT);

        /** Colors are red, green and blue values are between 0 and 255)  **/
        int red = 255;
        int green = 155;
        int blue = 255;
        
        /** Create a stripe **/        
        for(int x = 0; x < image.getWidth(); x++)
        {
            for(int y = 0; y < image.getHeight(); y++)
            {
                Pixel pixelObj = image.getPixel(x, y);              
                if(pixelObj.getX() == image.getWidth()-1 && pixelObj.getY() == 0){
                    pixelObj.setRed(255);
                    pixelObj.setGreen(0);
                    pixelObj.setBlue(0); 
                }
            }
        }
    

    }   
    
    public ArtDemo(String filename)
    {
        if(filename.equals(""))
        {
            image = new Picture("raindrop.jpg");            
        }
        else
        {
            image = new Picture(filename);
        }
        
    }
        
    /**
     * Show the Art object
     */
    public void show()
    {
        image.show();
    }
    
    
}
