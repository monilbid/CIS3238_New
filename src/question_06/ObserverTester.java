//
//  ANSWER TO QUESTION 5.1 FROM HORSTMANN BOOK
//

//Code referenced from the Horstmann website.
package question_06;

import java.util.ArrayList;

public class ObserverTester
{
   public static void main(String[] args)
   {
      ArrayList<Double> data = new ArrayList<Double>();

      data.add(new Double(4.0));
      data.add(new Double(3.0));
      data.add(new Double(2.0));
      data.add(new Double(1.0));

      DataModel model = new DataModel(data);

      TextFrame frame = new TextFrame(model);

      BarFrame barFrame = new BarFrame(model);

      model.attach(barFrame);
   }
}