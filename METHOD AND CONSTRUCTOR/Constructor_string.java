public class Constructor_string {
  String message;
 void Myclass(String message){
  this.message = message;

  }
  void display(){
    System.out.println("Message" +message);
  }
  public static void main(String[] args) {
    Constructor_string ob = new Constructor_string();
    ob.display();
  }
}
