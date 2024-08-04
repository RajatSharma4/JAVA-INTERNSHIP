public class Ins_with_Insvar {
    int value;
    void display(){
        System.out.println("VAlue: " +value);
    }
    public static void main(String[] args) {
        Ins_with_Insvar ob = new Ins_with_Insvar();
        ob.value = 10;
        ob.display();
    }
    
    
}
