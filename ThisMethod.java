  
// this keyword is use to pass as an argument in the method.


public class ThisMethod {
    void mba (ThisMethod logarithm){

        System.out.println("iam solve lagarithm problem ");

    }
    
    void exponential(){

        mba (this);
    }
    
    public static void main(String []args){

        ThisMethod t = new ThisMethod();

        t.exponential();

    }
}
