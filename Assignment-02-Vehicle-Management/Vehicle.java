public class Vehicle 
{
    public String brandName;
    public String modelName;
    public String color;
    public double price;
    private String mfgID;
    public float mileage;
    public int seatingCapacity;
    public char fuelType; // P: Petrol, D: Diesel, E: Electric
    public boolean auto;

    // sequence of parameter data types is called signature of constructor
    // two constructors with same sequence of parameter data types cannot be created
    // it confuses compiler which method to call

    // default constructor
    public Vehicle()
    {
        modelName = "Mercedes-Benz";
        brandName = "S-Class";
        color = "Obsidian Black";
        mfgID = "MBZ44332";
        price = 117300.00;
        fuelType = 'P';
    }

    // parameterised constructor
    public Vehicle(String brand, String model, double price, char fuel)
    {
        brandName = brand;
        modelName = model;
        this.price = price;
        fuelType = fuel;
        // this is used when parameter and variable in method has same name
        // also used for private variables
    }
    public Vehicle(String brand, double price, String c)
    {
        brandName = brand;
        this.price = price;
        color = c;
    }
    public Vehicle(String brand, String mfgID, int s, String color)
    {
        brandName = brand;
        this.mfgID = mfgID;
        seatingCapacity = s;
        this.color = color;
    }

    // copy constructor
    public Vehicle(Vehicle v)
    {
        brandName = v.brandName;
        modelName = v.modelName;
        color = v.color;
        price = v.price;
        seatingCapacity = v.seatingCapacity;
        mfgID = v.mfgID;
        fuelType = v.fuelType;
        auto = v.auto;
        mileage = v.mileage;
    }

    // to access private variables, we need setter and getter method
    // setter
    public void setMfgCode(String mfgID)
    {
        this.mfgID = mfgID;
    }

    // getter
    public String getMfgCode()
    {
        return mfgID;
    }

    public void start()
    {
        System.out.println(brandName + " is starting...");
    }
    public void drive()
    {
        System.out.println("This vehicle can be driven on all surfaces");
    }
    public void stop()
    {
        System.out.println("Stop ignition. You are at 0 kmph now!");
    }
    public float changeSpeed(float initialSpeed)
    {
        float newSpeed;
        if(initialSpeed < 20)
            newSpeed = initialSpeed + 20;
        else
            newSpeed = initialSpeed - 20;
        return newSpeed;
    }
    public float calcMileage(float distance, float fuelUnits)
    {
        switch(fuelType)
        {
            case 'P':
                mileage = distance/fuelUnits;
                break;

            case 'D':
                mileage = (distance/fuelUnits) * 1.15f;
                break;
        }
        return mileage;
    }
}
