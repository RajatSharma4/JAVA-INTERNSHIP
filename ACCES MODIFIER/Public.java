public class Public{
    public int number = 10; //public variable

    public void display(){
        System.out.println("Public method");
    }
}
class Mian{

    public static void main(String[] args) {
        Public ob = new Public();
        System.out.println(ob.number);
        ob.display();
        
    }
}