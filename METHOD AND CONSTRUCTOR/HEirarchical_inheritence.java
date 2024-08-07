//Parent class
class PAPA{
    void displa(){
        System.out.println("This is the PAPA class");
    }
}

//child class 1
class SON extends PAPA{
    void show(){
        System.out.println("This is the SON class");
    }
}

//child class 2
class DAUGHTER extends PAPA{
    void print(){
        System.out.println("This is the DAUGHTER class");
    }
}

public class HEirarchical_inheritence {
    public static void main(String[] args) {
        SON son = new SON();
        DAUGHTER dd = new DAUGHTER();
        son.displa();
        son.show();
        dd.displa();
        dd.print();
        
    }
}
