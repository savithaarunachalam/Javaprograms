package moolya1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch {
    public static void main(String[] args) throws IOException {
        int mobile;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the mobile phones");
        mobile=Integer.parseInt(br.readLine());
        switch (mobile) {

            case 1:
            System.out.println("Buy a Samsung phone");
            break;

            case 2:
            System.out.println("Buy an iPhone");
            break;

            case 3:
            System.out.println("Buy a Motorola phone");
            break;

            case 4:
            System.out.println("Buy a nokia phone");
            break;

            default:
                System.out.println("don't want to buy a any phone");
        }
    }
}
