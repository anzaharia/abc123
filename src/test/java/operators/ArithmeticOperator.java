package operators;

import org.testng.annotations.Test;

public class ArithmeticOperator {

    @Test
    public void testArithmeticOperator(){
        int a, b = 10, c = 5;
        a = b + c;
        System.out.println("Value of 'a' after '+' Arithmetic operation is " + a);
        a = b - c;
        System.out.println("Value of 'a' after '-' Arithmetic operation is " + a);
        a = b * c;
        System.out.println("Value of 'a' after '*' Arithmetic operation is " + a);
        a = b / c;
        System.out.println("Value of 'a' after '/' Arithmetic operation is " + a);
        a = b % c;
        System.out.println("Value of 'a' after '%' Arithmetic operation is " + a);
        b++;
        System.out.println("Value of 'b' after '++' Arithmetic operation is " + b);
        c--;
        System.out.println("Value of 'c' after '--' Arithmetic operation is " + c);
    }

}
