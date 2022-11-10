package moolya1;

public class Varchar {

    public static int add(int...numbers) {
        int add = 1;
        for (int j = 0; j < numbers.length; j++) {
            add = add + numbers[j];
        }
        return add;
    }


    public static void main(String[] args) {
        Varchar s = new Varchar();
        System.out.println(s.add(1,2,3,4,5));
    }

}









