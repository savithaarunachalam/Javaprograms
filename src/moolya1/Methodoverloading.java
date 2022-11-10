package moolya1;

public class Methodoverloading {
    public static void main1(){

        System.out.println("operators");
    }
    public static void lap1(int x,int y){
        System.out.println(x+y);
    }

    public static void cal1(int x,int y,int a){
        System.out.println(x*y*a);
    }

    public static void div (int x,int y){
        System.out.println(x/y);
    }
    public static void main(String[] args) {

       main1();
        lap1(1,3);
        cal1(1,2,3);
        div(1,2);

    }
}


