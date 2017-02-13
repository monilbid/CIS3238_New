package softwaredesignlab4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestClass {

    Date d1 = new Date(2017, 01, 30);
    Date d2 = new Date(2017, 01, 01);
    Date d3 = new Date(2016, 01, 01);
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Result result = JUnitCore.runClasses(softwaredesignlab4.TestClass.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        
        System.out.println("Completed tests!");
    }

    @Test
    public void testPrintMessage() {
        assertEquals(29, d1.dayTo(d2));
        assertEquals(27, d1.dayTo(d2));
    }
    
    @Test
    public void testPrintMessage2(){
        assertEquals(365, d2.dayTo(d3));
        assertEquals(325, d2.dayTo(d3));
    }
}