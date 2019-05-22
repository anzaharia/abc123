package operators;

import org.testng.annotations.Test;

public class ConditionalOperator {

    @Test
    public void conditionalOperator(){
        int Ten = 10;
        int Twenty = 20;
        int Thirty = 30;
        boolean bValue;
        int iValue;

        bValue = (Thirty == Twenty + Ten) ? true: false;
        System.out.println( "The boolean value of the variable 'bValue' is : " +  bValue ); //true

        iValue = ((Thirty == Twenty + Ten)) ? 50: 100;
        System.out.println( "The int Value of the variable iValue is : " + iValue ); //50

        //This is a use of Not Logical Operator
        iValue = (!(Thirty == Twenty + Ten)) ? 50: 100;
        System.out.println( "The int Value of the variable iValue is : " + iValue ); //100
    }


}
