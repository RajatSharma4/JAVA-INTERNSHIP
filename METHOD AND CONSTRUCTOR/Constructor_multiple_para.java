public class Constructor_multiple_para {
    String name = "Rajat";
    int age = 5;
   void Myclass(String name, int age){
    this.name = name;
    this.age = age;
   }
   void display(){
    System.out.println("Name -"  +name);
    System.out.println("Age -" +age);
   }
    public static void main(String[] args) {
        Constructor_multiple_para ob = new Constructor_multiple_para();
        ob.display();
        
    }
}
