package moolya1;

public class Stringarray {
    public static void main(String[] args) {
        String[] str = new String[6];
        int j;
        str[0] = "savi";
        str[1] = "arun";
        str[2] = "megala";
        str[3]="thangi";
        str[4]="kani";
        str[5]="vadivu";
        System.out.println(str.length);
        for (j = 0;j<=str.length-1;j++)
             System.out.println(str[j]);
    }
}
