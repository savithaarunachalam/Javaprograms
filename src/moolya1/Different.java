package moolya1;

public class Different {
    public static void main1(int x, int y) {
        System.out.println(x + y);

    }

    public static void lap1(int x, int y, int z) {
        System.out.println(x * y * z);
    }

    public static void cal1(int x, int y) {
        System.out.println(x / y);
    }

    public static void sub1(int x, int y) {
        System.out.println(x - y);
    }

    public static void main(String[] args) {

        main1(2, 3);
        lap1(4, 5, 1);
        cal1(3, 9);
        sub1(2, 2);
    }
}