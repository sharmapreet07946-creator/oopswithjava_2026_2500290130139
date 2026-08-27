package oopswithjava;
class Hello{
    void display(){
        System.out.println("Hello World");
    }
}
public class Test{
    public static void main(String[] args){
        Hello obj=new Hello();
        obj.display();
    }
}