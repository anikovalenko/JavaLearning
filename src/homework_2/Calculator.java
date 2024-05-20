package homework_2;

public class Calculator {

    static int sum(int number1, int number2) {
        return number1 + number2;
    }

    static int minus(int number1, int number2) {
        return number1 - number2;
    }

    static float divide(int number1, int number2) {
        float divide = number1 / number2;
        return divide;

    }

    static boolean isBigger(int number1, int number2) {


        if (number1 > number2) {
            return true;

        } else {

            return false;
        }
    }

    static boolean isSmaller(int number1, int number2) {
        if (number1 < number2) {
            return true;
        } else {
            return false;
        }


    }

    static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }

        return false;

    }

    static int multiply(int number1, int number2) {
        return (number1 * number2);

    }

}
