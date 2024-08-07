//Parent class
class PAPA{
    void display(){
        System.out.println("This is a PAPA class");
    }
}

//intermediate class
class SON extends PAPA{
    void show(){
        System.out.println("This is the SOn class");
    }
}

//derived class
class GRANDSON extends SON{
    void print(){
        System.out.println("This is the GRANSON class");
    }
}

public class Multilevel_inheritence {
    public static void main(String[] args) {
        GRANDSON sd = new GRANDSON();
        sd.display();
        sd.show();
        sd.print();
        
    }
}
