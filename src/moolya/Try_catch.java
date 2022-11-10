package moolya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try_catch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index= Integer.parseInt(br.readLine());

        int [] arr ={2,3,4,5};
        System.out.println(arr[index]);
        try {
            System.out.println(arr[index]);
        }
        catch(ArithmeticException e){

             System.out.println("You are getting an error because of " +e);
        }
        catch (Exception e){
            System.out.println("You are getting an error because of " +e);

        }

    }
}
