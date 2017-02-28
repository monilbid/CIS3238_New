//
//  ANSWER TO QUESTION 4.7 FROM HORSTMANN BOOK
//

package question_01;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;

public class MeasurerTest {
    public static void main(String[] args){
        int count = 30;
        Random rand = new Random();
        
        ArrayList<Rectangle> obj = new ArrayList<Rectangle>();
        
        for(int i = 0; i < count; i++){
            obj.add(new Rectangle(
                    rand.nextInt(10),
                    rand.nextInt(10),
                    rand.nextInt(10),
                    rand.nextInt(10)
            ));
        }
        
        for(Rectangle rect : obj){
            System.out.println(rect);
        }
        System.out.println();
        
        Measurer measure = new Measurer(){
            public double measure(Object x){
                Rectangle rect = (Rectangle) x;
                return rect.width * rect.height;
            }
        };
        
        Rectangle rect = (Rectangle) maximum(obj.toArray(), measure);
    }
    
    public static Object maximum(Object[] a, Measurer m){
        int positionOfMax = 0;
        Object max = a[0];
        double maxMeasure = m.measure(max);
        
        for(int i = 0; i < a.length; i++){
            Object toCheck = a[i];
         double measureToCheck = m.measure(toCheck);

         if (measureToCheck > maxMeasure)
         {
            positionOfMax = i;
            max = toCheck;
            maxMeasure = measureToCheck;
         }
        }
        
        return max;
    }
}
