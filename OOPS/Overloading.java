class Display{
    void show(int a){
        System.out.println("NUmber "+a);
    }
    void show(String a){
        System.out.println("Name" +a);
    }
}
public class Overloading {
    public static void main(String[] args) {
        Display sc= new Display();
        sc.show("VAibhav");
        sc.show(23);
    }
}
