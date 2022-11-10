package moolya;
class savitha{
    private int id; private String name;
    public void setName(String str){
        name=str;
        System.out.println(name);
    }
}

public class Validation {
    public static void main(String[] args){
        savitha sa = new savitha();
        sa.setName("arunsavi");
    }
}
