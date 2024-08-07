//parent class
class PAPA{
    void display(){
        System.out.println("This is the papa class");
    }
}

//child class 1
class SON extends PAPA{
    void show(){
        System.out.println("This is the son class");
    }
}

//child class 2
class MOM extends PAPA{
    void print(){
        System.out.println("This is the mom class");
    }
}

public class Heirarchical_inheritence {
    public static void main(String[] args) {
        SON sc = new SON();
        MOM vc = new MOM();
        sc.display();
        vc.display();
        sc.show();
        vc.print();
        
    }
}
