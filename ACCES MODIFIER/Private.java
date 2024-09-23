 class Private {
    private int number = 10;

    private void display(){
   System.out.println("Private method");
    }
    void show(){
        System.out.println(number);
        display();
    }
    }
    class San{
    public static void main(String[] args) {
     Private ob = new Private();
     ob.show();
        
    }
}
