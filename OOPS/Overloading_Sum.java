class Display{
    void show(int a, int b){
        System.out.println(a+b);
    }
    void show(float a, float b){
        System.out.println(a+b);
    }
}
public class Overloading_Sum {
    public static void main(String[] args) {
        Display sc = new Display();
        sc.show(3.5f, 4.6f);
        sc.show(220, 35);
    }
}
