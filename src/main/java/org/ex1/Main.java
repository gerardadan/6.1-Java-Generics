package org.ex1;

public class Main {
    public static void main(String[] args) {
        executeNoGenericMethods();
    }

    private static void executeNoGenericMethods() {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;

        try {
            System.out.println("Initialize object1 with arguments in natural position");
            NoGenericMethods noGenericMethods1 = new NoGenericMethods(number1, number2, number3);
            testNoGenericMethodsPrint(noGenericMethods1);

            System.out.println("Set arguments object1 reverse position");
            noGenericMethods1.setAllValues(number3, number2, number1);
            testNoGenericMethodsPrint(noGenericMethods1);

            System.out.println("Initialize object2 with arguments in random position");
            NoGenericMethods noGenericMethods2 = new NoGenericMethods(number2, number3, number1);
            testNoGenericMethodsPrint(noGenericMethods2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid type of int: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred during execution: " + e.getMessage());
        }

    }

    private static void testNoGenericMethodsPrint(NoGenericMethods noGenericMethods) {
        System.out.println("Argument 1 -> " + noGenericMethods.getNumber1());
        System.out.println("Argument 2 -> " + noGenericMethods.getNumber2());
        System.out.println("Argument 3 -> " + noGenericMethods.getNumber3());
    }
}