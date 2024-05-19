package homework_2;

public class ArrayDemo {

    static int[] array = new int[10];

    public static void main(String[] args) {
        array[0] = 50;
        array[1] = 56;
        array[2] = 52;
        array[3] = 54;
        array[4] = 46;
        array[5] = 96;
        array[6] = 45;
        array[7] = 41;
        array[8] = 35;
        array[9] = 91;

        loop(array);

    }

    static void loop(int[] inchvorBan){
        System.out.println(inchvorBan[1] % 2);
        System.out.println(inchvorBan[2] % 2);
        System.out.println(inchvorBan[3] % 2);
        System.out.println(inchvorBan[4] % 2);
        System.out.println(inchvorBan[5] % 2);
        System.out.println(inchvorBan[6] % 2);
        System.out.println(inchvorBan[7] % 2);
        System.out.println(inchvorBan[8] % 2);
        System.out.println(inchvorBan[9] % 2);
    }
}
