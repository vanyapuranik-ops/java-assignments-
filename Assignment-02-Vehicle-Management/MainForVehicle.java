public class MainForVehicle 
{
    public static void main(String[] args)
    {
        // Vehicle() is constructor
        Vehicle v1 = new Vehicle();
        v1.calcMileage(500, 25);

        float newSpeed = v1.changeSpeed(40);
        System.out.println("New Speed:" + newSpeed);

        Vehicle v2 = new Vehicle("Lamborghini", "Revuelto", 608358.00, 'P'); 
        v2.calcMileage(300, 40);

        Vehicle v3 = new Vehicle("Tesla", 89990.50, "Midnight Silver");


        Vehicle v4 = new Vehicle("Ford", "MUS77889", 5, "Grabber Blue");
        v4.fuelType = 'D';
        v4.calcMileage(600, 30);

        Vehicle v5 = new Vehicle(v4);
        v5.setMfgCode("JEP44556");
        v5.fuelType = 'D';
        v5.calcMileage(400, 75);
        v5.auto = true;

        Vehicle[] myFleet = new Vehicle[]{v1, v2, v3, v4, v5};

        System.out.println("\n===== VEHICLE INVENTORY REPORT =====");
        System.out.printf("%-15s %-15s %-15s %-15s %-10s %-10s %-10s\n", "BRAND", "MODEL", "MFG ID", "FUEL", "MILEAGE", "PRICE", "COLOR");
        System.out.println("------------------------------------------------------------------");

        for(Vehicle v:myFleet)
        {
            System.out.println("\n");
            System.out.printf("%-15s %-15s %-15s %-15s %-10.2f %-10.2f %-10s\n",
                              v.brandName, v.modelName, v.getMfgCode(), v.fuelType, v.mileage, v.price, v.color);
            System.out.println("==================================================================\n");
            v.start();
            v.drive();
            v.stop();
        }
    }
}
