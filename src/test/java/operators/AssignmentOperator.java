package operators;

import org.testng.annotations.Test;

public class AssignmentOperator {

    int speed = 80; // speed variable gets the value 80
    int distance = 20; // distance variable gets the value 20
    int time = 10; // time variable gets the value 10
    String name = "ToolsQA"; // name variable gets the value ToolsQA
    boolean isGood = true; // isGood variable gets the value true

    @Test
    public void testAssignmentOperator() {

        System.out.println("Value stored in the speed variable is : " + speed);
        System.out.println("Value stored in the distance variable is : " + distance);
        System.out.println("Value stored in the time variable is : " + time);
        System.out.println("Value stored in the name variable is : " + name);
        System.out.println("Value stored in the isGood variable is : " + isGood);

        speed = 100; // Previous value of speed is overwritten with 100
        time = distance; // Previous value of time is overwritten with distance value
        name = "ForumsQA"; // Previous value of name is overwritten with ForumsQA
        isGood = false; // Previous value of isGood is overwritten with false
        System.out.println("Value stored in the speed variable is : " + speed);
        System.out.println("Value stored in the time variable is : " + time);
        System.out.println("Value stored in the name variable is : " + name);
        System.out.println("Value stored in the isGood variable is : " + isGood);

        //Multiple Assignments
        speed = distance = 0; // 100 (20 = 0) 
        System.out.println("Value stored in the speed variable is : " + speed);

        //Illegal Assignments - Compile time errors
//        speed = "ToolsQA"; //String can not be assign to integer
//        name = 10; // Integer can not be assign to String
//        isGood = "ToolsQa" // String can not be assign to Boolean
    }


}
