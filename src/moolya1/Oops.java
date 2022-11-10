package moolya1;

public class Oops {
    public static void area(int r){
            double area=3.14*r*r;
            System.out.println(area);
    }

        public static void area(int x,int y,int z){
            double savitha=2*3.14*x*y*z;
            System.out.println(savitha);
        }

        public static void main(String[]  args) {
        Oops s= new Oops();
        s.area(4);
        s.area(2,3,4);

    }

}
