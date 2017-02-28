//
//  ANSWER TO QUESTION 4.8 FROM HORSTMANN BOOK
//

package question_02;

import java.util.Random;

public class FilterTest {

    public static void main(String[] args) {
        int count = 30;
        Random rand = new Random();

        String[] obj = new String[count];

        for (int i = 0; i < count; i++) {
            obj[i] = (generateRandomString());
        }
        
        System.out.println("Unfiltered String Array:");
        for(String str : obj){
            System.out.println(str);
        }
        System.out.println();
        
        Filter filter = new Filter(){
            public boolean accept(String x){
                //Test that each string is less than or equal to 3
                String str = (String) x;
                return str.length() <= 3;
            }
        };
        
        String[] str = filter(obj, filter);
        
        System.out.println("Filtered String Array:");
        //Print out each element of the filtered array
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
    }
    
    public static String[] filter(String[] a, Filter f){
        int j = 0;
        //First loop to get the size that will be of the return string array
        for(int i = 0; i < a.length; i++){
            if(f.accept(a[i])){
                j++;
            }
        }
        
        String[] return_string = new String[j];
        
        j = 0;
        
        //Populate the array of strings for returning
        for(int i = 0; i < a.length; i++){
            if(f.accept(a[i])){
                return_string[j] = a[i];
                j++;
            }
        }
        
        return return_string;
    }
    
    
    // This function takes in no input
    // This function returns a string of a random length between 1 and 10
    // The return string will consist of ascii characters from small case "a" to small case "z"
    public static String generateRandomString() {
        int min_ascii = 97; //Value of the minimum ascii character for small case "a"

        int max = 10;
        Random rand = new Random();

        String return_string = "";
        for (int i = 0; i < rand.nextInt(max) + 1; i++) {
            return_string += (char) (rand.nextInt(26) + min_ascii);
        }
        return return_string;
    }
}
