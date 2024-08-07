//parent class
class NAN{
    void show(){
        System.out.println("Welcome to inheritence parent class");
    }
}

//child class
class WAN extends NAN{
    void print(){
        System.out.println("Welcome to inheritence child class");
    }
}
public class Single_inheritence{
    public static void main(String[] args) {
        WAN sc = new WAN();
        sc.show();
        sc.print();
        
    }
}