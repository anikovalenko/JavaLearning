package homework_2;

class MainClass {

    public static void main(String[] args){
        int result = Calculator.sum(7,4);
        System.out.println(result);

        int result2 = Calculator.minus(8,5);
        System.out.println(result2);

        float divide =  Calculator.divide(5,2);
        System.out.println(divide);

        boolean isbiger = Calculator.isBigger(10,4);
        System.out.println(isbiger);

        boolean isEven = Calculator.isEven(5);
        System.out.println(isEven);

        boolean isSmaller = Calculator.isSmaller(7,6);
        System.out.println(isSmaller);

        int multiply = Calculator.multiply(5,5);
        System.out.println(multiply);

    }


}
