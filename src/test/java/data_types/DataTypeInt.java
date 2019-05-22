package data_types;

import org.testng.annotations.Test;

public class DataTypeInt {

    @Test
    public void intTest() {
        //Use the int keyword to declare integer variable
        int carSpeed;

        //Initialize the integer variable with value 20
        carSpeed = 20;

        //Print the value of integer variable
        System.out.println("Car is running at the speed of: " +  carSpeed);

        //Change the value of integer variable
        carSpeed = carSpeed + 20;

        //Print the value of integer variable
        System.out.println("Current speed of the car is: " +  carSpeed);
    }



}
