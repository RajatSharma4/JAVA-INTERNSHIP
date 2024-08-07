//parent class
class FAV{
    void display(){
        System.out.println("Welcome to parent class");
    }
}

//intermediate class
class WAW extends FAV{
    void show(){
        System.out.println("This is an intermediate class");
    }
}

//Derived class
class VAV extends WAW{
    void print(){
        System.out.println("this is the derived class");
    }
}

public class Multilevel_inheritence {
    public static void main(String[] args) {
        VAV dc = new VAV();
        dc.display();
        dc.show();
        dc.print();
        
    }
}