package moolya1;
class one{                   //it is a parent class
    public int cal(int x,int y){
        return x+y;
    }

}

class two extends one{          //it is a first child class
    public int cal_adv1(int x,int y){
        return x-y;
    }
}
class three extends one{          //it is a second child class
    public int cal_adv2(int x,int y){
        return x*y;
    }
}
class four extends one{       //it s a third child class
    public int div(int x,int y){
        return x/y;
    }
}

public class Inheritance {
    public static void main(String [] args){
       four d = new four();  //creating object for last child class
       d.div(4,4);
       System.out.println(d.div(4,4));

    }
}
