public class Uber {
    public static void main(String[] args)
    {
        Uber obj = new Uber();
        obj.calculateFare();
        Auto auto = obj.new Auto();
        auto.calculateFare();
        TaxiCar taxiCar = obj.new TaxiCar();
        taxiCar.calculateFare();
        Bike bike = obj.new Bike();
        bike.calculateFare();
    }
    String driverName;
    void calculateFare()
    {

        System.out.println("Calculating Fare:");
    }
    class Auto extends Uber
    {
        @Override
        void calculateFare()
        {
            String driverName = "Hari";
            double fare = 60.00;
            System.out.println("\n " + driverName +"\n Auto Fare is: " + fare);
        }
    }
    class TaxiCar extends Uber
    {
        @Override
        void calculateFare()
        {
            String driverName= "Deva";
            double fare = 150.00;
            System.out.println("\n " + driverName +"\n Taxi Car Fare is: " + fare);
        }
    }
    class Bike extends Uber
    {
        @Override
        void calculateFare()
        {
            String driverName = "Kiran";
            double fare = 30.00;
            System.out.println("\n " + driverName +"\n Bike Fare is: " + fare);
        }
    }
}