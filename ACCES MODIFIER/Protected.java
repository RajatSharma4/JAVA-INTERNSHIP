public class Protected {
    protected int number = 20; //protected variable

    protected void display(){
        System.out.println("Protected method");
    }
}
class Main{

    public static void main(String[] args) {
        Protected ob = new Protected();
        System.out.println(ob.number);
        ob.display();
        
    }
}
