//  Member inner class concept

public class InnerClass {
    
    private int data  = 100;

    class inner{
        void msg(){

    System.out.println(data);

        }
    }

    void display(){

        inner in = new inner();
         in.msg();
    
    }

    public static void  main(String arg[]){

         InnerClass in = new InnerClass();
         in.display();

    }

}
