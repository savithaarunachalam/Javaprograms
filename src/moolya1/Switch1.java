package moolya1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch1 {
    public static void main(String[] args)  throws IOException {
        int i,j,a;
        System.out.println("Enter two number");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        i=Integer.parseInt(br.readLine());
        j=Integer.parseInt(br.readLine());
        a=Integer.parseInt(br.readLine());
        switch(a) {
            case 1 :
                if(i<j)
                    System.out.println(i+j);
                    break;
            case 2:
                if(i>j)
                    System .out.println(i*j);
                    break;
            default:
                    System.out.println("number is not valid");

        }

    }
}
