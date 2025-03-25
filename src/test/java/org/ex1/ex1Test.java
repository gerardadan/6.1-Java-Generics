package org.ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ex1Test {
    @Test
    @DisplayName("Ex1_NoGenericMethods")
    void testNoGenericMethods() {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;

        NoGenericMethods noGenericMethods = new NoGenericMethods(number1, number2, number3);
        testNoGenericMethodsPrint(noGenericMethods);

        noGenericMethods.setAllValues(number1, number2, number3);
        testNoGenericMethodsPrint(noGenericMethods);

        noGenericMethods.setAllValues(number3, number2, number1);
        testNoGenericMethodsPrint(noGenericMethods);
    }

    void testNoGenericMethodsPrint(NoGenericMethods noGenericMethods){
        System.out.println("Argument 1 -> " + noGenericMethods.getNumber1());
        System.out.println("Argument 2 -> " + noGenericMethods.getNumber2());
        System.out.println("Argument 3 -> " + noGenericMethods.getNumber3());
    }
}
