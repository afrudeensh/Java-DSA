package BasicSyntaxOfDSAJava;

interface A{
    void display();
}
public class Lambda {
    public static void main(String[] args) {
//        A obj = new A(){
//            @Override
//            public void display() {
//                System.out.println("The display method called");
//            }
//        };
//        obj.display();

        A obj = ()->{
            
                System.out.println("The display method called");

        };
        obj.display();
    }
}
