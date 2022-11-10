package moolya1;

public class Elseif {
    public static void main(String[] args) {
        int marks=65;

        if(marks<50){
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60){
            System.out.println("D grade");
        }
        else if(marks>=60 && marks<70){
            System.out.println("C grade");
        }
    }
}
