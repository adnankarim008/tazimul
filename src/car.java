
public class car {

    int model,topSpeed;
    String brand;


    public static int totalNumberOfCarsCreated = 0;

    // constructors
    public car( int model, String brand, int topSpeed ){

        this.model = model;
        this.brand = brand;
        this.topSpeed = topSpeed;
        totalNumberOfCarsCreated = totalNumberOfCarsCreated + 1;

    }

    // constructors using car as a source, duplicate
    public car( car source){
        this.model = source.model;
        this.brand = source.brand;
        this.topSpeed = source.topSpeed;
        totalNumberOfCarsCreated = totalNumberOfCarsCreated + 1;
    }

    // method within a class
    public void run(){
        System.out.println(brand + " is running now");

    }

    //method to compare top speed with another car
    public boolean isFaster(car source){
        if(source.topSpeed < this.topSpeed)
            return true;
        else
            return false;
    }

}
