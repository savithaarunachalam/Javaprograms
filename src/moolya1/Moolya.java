package moolya1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class Moolya {
        public static void main(String[] args) throws IOException {
            int i; int j;
            System.out.println("Enter two number");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            i=Integer.parseInt(br.readLine());
            j=Integer.parseInt(br.readLine());
            int sum=j+i;
            int sub=j-1;
            int mul=j*i;
            System.out.println(sum);
            System.out.println(sub);
            System.out.println(mul);

        }
}
