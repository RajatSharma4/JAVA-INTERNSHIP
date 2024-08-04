public class Ins_with_Ret {
  
    int add(int a, int b){
    return a+b;
}
public static void main(String[] args) {
    Ins_with_Ret ob = new Ins_with_Ret();
    int result = ob.add(5, 3);
    System.out.println("Sum: " +result);
}
}