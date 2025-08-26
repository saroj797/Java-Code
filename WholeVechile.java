class Vechile{
    void MainVechile(){

        System.out.println("All vechile are run");
 }

}

class Bike extends Vechile{
    void NewBike(){

        System.out.println("Bike moving fast");
    }
}

class Train extends Vechile{
    void NewTrain(){

        System.out.println("Train moving 120 km/h");

    }
}
 
class Car extends Vechile{
    void DesignerCar(){

        System.out.println("Car is Defender");

    }
}


public class WholeVechile {

    public static void main(String arg[]){

        Bike b = new Bike();
        Train t = new Train();
        Car c = new Car();

        b.MainVechile();
        b.NewBike();

        t.MainVechile();
        t.NewTrain();

        c.MainVechile();
        c.DesignerCar();

    }


    
}
