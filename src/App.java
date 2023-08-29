public class App {
    public static void main(String[] args) throws Exception {


       car x = new car(343, "Tesla", 300);

       // accessing variables within classes using dot notation. Changes the brand of the car here.
       x.brand = "BMW" ;

       // Using methods of classes using . notation.
       x.run();


       car y = new car(343, "Toyota", 200);
       y.run();

       System.out.println(y.isFaster(x));

       // equals is prebuilt in java to compare objects we have created which compares if x is equal to y as a boolean
       y.equals(x);
    
       // After creating 2 cars
       System.out.println("After creating 2 cars");
       System.out.println(y.totalNumberOfCarsCreated);
       System.out.println(x.totalNumberOfCarsCreated);

       car z = new car(y);
       car a = new car (z);

       System.out.println("After creating 4 cars");
       System.out.println(y.totalNumberOfCarsCreated);
       System.out.println(x.totalNumberOfCarsCreated);
       System.out.println(z.totalNumberOfCarsCreated);
       System.out.println(a.totalNumberOfCarsCreated);




       rental myNewBrand = new rental(x, y, new car(342, "Audi", 300) );

       rental mySecondRentalCompany = new rental(new car(x), new car(23423, "Mazda", 400), new car(y));






       

       
       

    }

}
