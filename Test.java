class Animal{
    void Eat(){

        System.out.println("animal is eating");

    }
}

class Dog extends Animal{
     void Barking(){

        System.out.println("Dog is a barking");

     }
     
     }

public class Test  {

    public static void main(String arg[]){

        Dog d = new Dog();

        d.Eat();
        d.Barking();

    }
  
}
