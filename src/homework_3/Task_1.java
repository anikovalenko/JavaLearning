package homework_3;

public class Task_1 {

    public static void main(String[] args) {

//        drawLeftUpTriangle(5);
//        drawRightUpTriangle(5);
//        drawLeftBottomTriangle(10);
//        drawRightBottomTriangle(10);
//        drawRhombus(10);
//        drawIsoscelesTriangle(10);
//        drawBottomIsoscelesTriangle(10);
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * *
     * * *
     * * * *
     * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length) {
        int pointer = 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < pointer; j++) {
                System.out.print("* ");
            }
            pointer++;
            System.out.println();

        }
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     *         *
     *       * *
     *     * * *
     *   * * * *
     * * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length) {
        int pointer = 1;
        for (int i = 0; i < length;i++) {
            for (int j = length; j > 0; j--) {
              if (j>pointer){
                  System.out.print("  ");
              } else {
                  System.out.print("* ");
              }
            }
            pointer++;
            System.out.println();

        }
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {
    // Todo write logic here
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * * * * *
     *   * * *
     *     * *
     *       *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length) {
    // Todo write logic here
    }

    /**
     * Draws the rhombus by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     * <p>
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length) {
    // Todo write logic here
    }


    /**
     * lenght = 5
     *         *
     *       * * *
     *     * * * * *
     *   * * * * * * *
     * * * * * * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawIsoscelesTriangle(int length) {
    // Todo write logic here
    }


    /**
     * * * * * * * * * *
     *   * * * * * * *
     *     * * * * *
     *       * * *
     *         *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawBottomIsoscelesTriangle(int length) {
    // Todo write logic here
    }
}