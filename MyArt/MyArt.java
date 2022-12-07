import java.util.ArrayList;

/**
 * Write a description of class MyArt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyArt
{
    /** you put your code here  **/
    private Picture image;
    public MyArt(){
        image = new Picture("kitten.jpg");
    }

    public MyArt(String filename){
        image = new Picture(filename);
    }

    public MyArt(int size){
        final int WIDTH = size;
        final int HEIGHT = size*2;

        image = new Picture(WIDTH, HEIGHT);

        int red = (int)(255*Math.random());
        int green = (int)(255*Math.random());
        int blue = (int)(255*Math.random());

        for(int x = 0; x < image.getWidth(); x++)
        {
            for(int y = 0; y < image.getHeight(); y++)
            {
                Pixel pixelObj = image.getPixel(x, y);              
                pixelObj.setRed(red);
                pixelObj.setGreen(green);
                pixelObj.setBlue(blue); 

            }
        }
    }

    public MyArt(int width, int height){
        image = new Picture(width, height);
        int red;
        int green;
        int blue;

        for(int x = 0; x < image.getWidth(); x++)
        {
            for(int y = 0; y < image.getHeight(); y++)
            {
                Pixel pixelObj = image.getPixel(x, y);  
                red = (int)(255*Math.random());
                green = (int)(255*Math.random());
                blue = (int)(255*Math.random());

                pixelObj.setRed(red);
                pixelObj.setGreen(green);
                pixelObj.setBlue(blue); 

            }
        }
    }

    public void show(){
        image.show();
    }

    public Picture getImage(){
        return image;
    }

    public boolean equals(Object otherObject)
    {
        if (!(otherObject instanceof MyArt))
        {
            return false;
        }

        MyArt otherArt = (MyArt) otherObject;
        Picture otherImage = otherArt.getImage();  

        if(otherImage.getWidth()!=image.getWidth() || otherImage.getHeight()!=image.getHeight())
        {
            return false;
        }

        for(int x = 0; x < image.getWidth(); x++)
        {
            for(int y = 0; y < image.getHeight(); y++)
            {
                Pixel otherPix = otherImage.getPixel(x, y);
                Pixel thisPix = image.getPixel(x, y);

                int thisRed = thisPix.getRed();
                int thisGreen = thisPix.getGreen();
                int thisBlue = thisPix.getBlue();

                int otherRed = otherPix.getRed();
                int otherGreen = otherPix.getGreen();
                int otherBlue = otherPix.getBlue();

                if ((thisRed != otherRed) || (thisGreen != otherGreen) || (thisBlue != otherBlue))
                {
                    return false;
                }
            }
        }    
        return true;
    }       

    public void export(String outputFileName)
    {
        if(outputFileName == null)
        {
            outputFileName = "myMasterpiece.jpg";
        }else{
            outputFileName += ".bmp";
        }
        java.io.File outputFile = new java.io.File(outputFileName);
        java.awt.image.BufferedImage bi = image.getBufferedImage();
        try{
            javax.imageio.ImageIO.write(bi, "bmp", outputFile);
        }catch(Exception e){
        }
    }
    
    public void reflect(){

        for(int y = 0; y < image.getHeight(); y++)
        {
            for(int x = 0; x < (int)(image.getWidth()/2.0); x++)
            {
                Pixel pixelObj = image.getPixel(x, y);  
                Pixel reflectObj = image.getPixel(image.getWidth()-1-x,y);

                int tempRed = pixelObj.getRed();
                int tempGreen = pixelObj.getGreen();
                int tempBlue = pixelObj.getBlue();

                pixelObj.setRed(reflectObj.getRed());
                pixelObj.setGreen(reflectObj.getGreen());
                pixelObj.setBlue(reflectObj.getBlue()); 

                reflectObj.setRed(tempRed);
                reflectObj.setGreen(tempGreen);
                reflectObj.setBlue(tempBlue);

            }
        }
    }

    public void doubleHorizontal(){
        Picture doubleImg = new Picture(image.getWidth()*2,image.getHeight());

        for(int y = 0;y<image.getHeight();y++){
            for(int x = 0;x<image.getWidth();x++){
                Pixel pixelObj = image.getPixel(x, y);

                Pixel firstPix = doubleImg.getPixel(x,y);
                Pixel secondPix = doubleImg.getPixel(x+image.getWidth(),y);

                firstPix.setRed(pixelObj.getRed());
                firstPix.setGreen(pixelObj.getGreen());
                firstPix.setBlue(pixelObj.getBlue());

                secondPix.setRed(pixelObj.getRed());
                secondPix.setGreen(pixelObj.getGreen());
                secondPix.setBlue(pixelObj.getBlue());

            }
        }
        image = doubleImg;

    }

    public void doubleVertical(){
        Picture doubleImg = new Picture(image.getWidth(),image.getHeight()*2);

        for(int y = 0;y<image.getHeight();y++){
            for(int x = 0;x<image.getWidth();x++){
                Pixel pixelObj = image.getPixel(x, y);

                Pixel firstPix = doubleImg.getPixel(x,y);
                Pixel secondPix = doubleImg.getPixel(x,y+image.getHeight());

                firstPix.setRed(pixelObj.getRed());
                firstPix.setGreen(pixelObj.getGreen());
                firstPix.setBlue(pixelObj.getBlue());

                secondPix.setRed(pixelObj.getRed());
                secondPix.setGreen(pixelObj.getGreen());
                secondPix.setBlue(pixelObj.getBlue());

            }
        }
        image = doubleImg;
    }

    public void border(){
        int borderWidthLeft = (int)(image.getWidth()*0.05);
        int borderHeightTop = (int)(image.getHeight()*0.05);
        int borderWidthRight = (int)Math.round(image.getWidth()*0.05);
        int borderHeightBottom = (int)Math.round(image.getHeight()*0.05);

        int width = borderWidthLeft+borderWidthRight+image.getWidth();
        int height = borderHeightTop+borderHeightBottom+image.getHeight();
        Picture doubleImg = new Picture(width,height);
        //int count = 0;
        //System.out.println(borderWidth+image.getWidth());
        //System.out.println(borderHeight+image.getHeight());

        //System.out.println(borderWidth);
        //System.out.println(doubleImg.getWidth() - borderWidth);
        //System.out.println(borderHeight);
        //System.out.println(doubleImg.getHeight() - borderHeight);

        System.out.println(doubleImg.getHeight());
        System.out.println(doubleImg.getWidth());
        for(int y = 0;y<doubleImg.getHeight();y++){
            for(int x = 0;x<doubleImg.getWidth();x++){
                Pixel pixelBorder = doubleImg.getPixel(x,y);
                if(x >= borderWidthLeft && x < doubleImg.getWidth() - borderWidthRight && y >= borderHeightTop && y < doubleImg.getHeight() - borderHeightBottom){
                    Pixel pixelObj = image.getPixel(x-borderWidthLeft, y-borderHeightTop);
                    //System.out.print(x-borderWidth);
                    //System.out.print(y-borderHeight);
                    //System.out.println();
                    //count++;
                    pixelBorder.setRed(pixelObj.getRed());
                    pixelBorder.setGreen(pixelObj.getGreen());
                    pixelBorder.setBlue(pixelObj.getBlue());
                }else{
                    pixelBorder.setRed(0);
                    pixelBorder.setGreen(0);
                    pixelBorder.setBlue(0);
                }

            }
        }
        //System.out.println(count);
        image = doubleImg;
    }

    public void swapColors(){

        for(int y = 0;y<image.getHeight();y++){
            for(int x = 0;x<image.getWidth();x++){
                Pixel pixelImg = image.getPixel(x,y);
                int tempRed = pixelImg.getRed();

                pixelImg.setRed(pixelImg.getGreen());
                pixelImg.setGreen(pixelImg.getBlue());
                pixelImg.setBlue(tempRed);

            }
        }

    }

    public static void masterpiece(){
        Picture image = new Picture(1080,1920);
        int[][] board = new int[54][96];
        for(int y = 0;y<54;y++){
            for(int x = 0;x<96;x++){

                if((int)(7*Math.random()) == 0){
                    for(int row = y*20;row<y*20+20;row++){
                        for(int col = x*20;col<x*20+20;col++){
                            Pixel pixelImg = image.getPixel(row,col);
                            pixelImg.setRed(255);
                            pixelImg.setGreen(255);
                            pixelImg.setBlue(255);
                            board[y][x] = 1;
                        }
                    }

                }
                else{

                    for(int row = y*20;row<y*20+20;row++){
                        for(int col = x*20;col<x*20+20;col++){
                            Pixel pixelImg = image.getPixel(row,col);
                            pixelImg.setRed(0);
                            pixelImg.setGreen(0);
                            pixelImg.setBlue(0);
                            board[y][x] = 0;
                        }
                    }
                }
            }
        }
        int t = 0;
        while(t < 2000){
            image.hide();
            image.show();

            board = newBoard(board).clone();

            /*
            for(int y = 0;y<50;y++){
            for(int x = 0;x<50;x++){
            System.out.print(board[y][x]);
            }
            System.out.println();
            }
             */
            for(int y = 0;y<54;y++){
                for(int x = 0;x<96;x++){

                    for(int row = y*20;row<y*20+20;row++){
                        for(int col = x*20;col<x*20+20;col++){
                            Pixel pixelImg = image.getPixel(row,col);
                            if(board[y][x] == 1){
                                pixelImg.setRed(255);
                                pixelImg.setGreen(255);
                                pixelImg.setBlue(255);
                            }else{
                                pixelImg.setRed(0);
                                pixelImg.setGreen(0);
                                pixelImg.setBlue(0);
                            }

                        }
                    }

                }

            }
            try
            {
                Thread.sleep(700);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
            //System.out.println("pass"); 96 54
            t += 1;
        }
    }

    private static int[][] newBoard(int[][] board){
        int[][] temp = board.clone();
        for(int row = 0;row<54;row++){
            for(int col = 0;col<96;col++){

                int alive = board[row][col];
                int neighbors = 0;
                for(int y = -1;y<=1;y++){
                    for(int x = -1;x<=1;x++){
                        if(col+x >= 0 && col+x < 96 && row+y >= 0 && row+y < 54){
                            //System.out.println(row+x);
                            //System.out.println(col+x);
                            //System.out.println();
                            if(board[row+y][col+x] == 1){
                                neighbors += 1;
                            }
                        }

                    }
                }
                if(alive == 1){
                    neighbors -= 1;
                }
                if(alive == 1 && (neighbors == 2 || neighbors == 3)){
                    temp[row][col] = 1;
                }
                else if(alive == 0 && neighbors == 3){
                    temp[row][col] = 1;
                }
                else if(alive == 1 && (neighbors < 2)){
                    temp[row][col] = 0;
                }
                else if(alive == 1 && (neighbors > 3)){
                    temp[row][col] = 0;;
                }
            }
        }
        return temp;
    }
}

