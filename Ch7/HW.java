
/**
 * Write a description of class HW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HW
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        int[] values = {2,3,5,7,11,13};
        int first = values[0];
        for(int i = 1;i<values.length;i++){
            values[i-1] = values[i];
        }
        values[values.length-1] = first;
        
        for(int i : values){
            System.out.println(i);
        }
        
        
        
        
    }
    
    
    public static void main2(){
        String[] words = {"horse","car","computer","sleep","hi"};
        
        int maxLength = 0;
        int maxIdx = 0;
        for(int i = 1;i<words.length;i++){
            if(words[i].length() > maxLength){
                maxIdx = i;
                maxLength = words[i].length();
            }
        }
        
        for(int i = maxIdx+1;i<words.length;i++){
            words[i-1] = words[i];
        }
        words[words.length-1] = null;
        
        
        for(String word : words){
            System.out.println(word);
        }
    }
    public static int longestRun(int[] ar){
        int repeatedElement = ar[0];
        int count = 1;
        
        int highestElement = 1;
        int highCount = 1;
        
        for(int i = 1;i<ar.length;i++){
            
            if(ar[i] == repeatedElement){
                count++;
            }else{
                if(count > highCount){
                    highCount = count;
                    highestElement = repeatedElement;
                }
                repeatedElement = ar[i];
                count = 1;
                
                
            }
        }
        System.out.println(highCount);
        return highestElement;
        
    }
    
    public static int countClumps(int[] arr){
        int numClumps = 0;
        int currentCount = 1;
        for(int z = 1;z<arr.length;z++){
            if(arr[z] != arr[z-1]){
                if(currentCount > 1){
                    numClumps++;
                    
                }
                currentCount = 1;
            }else{
                if(z == arr.length-1){
                    numClumps++;
                }
                currentCount++;
            }
            
        }
        return numClumps;
    }
    
    public static int[] evenOdd(int[] arr){
	int numEven = 0;
	for(int x = 0;x<arr.length-numEven;x++){

		if(arr[x] % 2 == 1){
			int temp = arr[x];
			for(int y = x+1;y<arr.length-numEven;y++){
				arr[y-1] = arr[y];
			}
			arr[arr.length-1] = temp;
			numEven++;
		}



	}
	return arr;



    }
    
}
