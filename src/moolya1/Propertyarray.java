package moolya1;

public class Propertyarray {
    public static void main(String[] args) {
        int [] i={3,4,5,6,7};
        int sum=0; //
        int product=1;

        for (int j=0;j<i.length;j++) {
            sum = sum + i[j];//
            product=product*i[j];
        }

        System.out.println(product);
    }
}
