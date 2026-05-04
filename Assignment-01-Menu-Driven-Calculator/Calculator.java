import java.util.Scanner;
public class Calculator 
{
    public float num1, num2; // integer division happens even after declaring float if inputs are integers
    public int choice;

    public float addNums(float n1, float n2)
    {
        return n1+n2;
    }
    public float subtractNums(float n1, float n2)
    {
        return n1-n2;
    }
    public float multiplyNums(float n1, float n2)
    {
        return n1*n2;
    }
    public float divideNums(float n1, float n2)
    {
        return n1/n2;
    }
    public float calcModulus(float n1, float n2)
    {
        return n1%n2;
    }

    public static void main(String[] args)
    {
        Calculator c = new Calculator(); // constructor of class
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while(run)
        {
            System.out.println("Choose Arithmetic Operation: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Modulus");
            c.choice = sc.nextInt();
            
            switch(c.choice)
            {
                case 0:
                    System.out.println("exiting.....");
                    System.exit(0);

                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("enter first number:");
                    c.num1 = sc.nextFloat();

                    System.out.println("enter second number:");
                    c.num2 = sc.nextFloat();

                    if(c.choice == 1)
                        System.out.println("sum:" + c.addNums(c.num1, c.num2));
                    else if(c.choice == 2)
                        System.out.println("difference:" + c.subtractNums(c.num1, c.num2));
                    else if(c.choice == 3)
                        System.out.println("product:" + c.multiplyNums(c.num1, c.num2));
                    else if(c.choice == 4)
                    {
                        if(c.num2 == 0)
                            System.out.println("cannot divide by 0");
                        else
                            System.out.println("quotient:" + c.divideNums(c.num1, c.num2));
                    }
                    else
                        System.out.println("remainder:" + c.calcModulus(c.num1, c.num2));
                    break;
                
                default:
                    System.out.println("invalid choice");
            }
        }
        sc.close();
    }
}
