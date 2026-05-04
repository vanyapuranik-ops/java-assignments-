import java.util.InputMismatchException;
import java.util.Scanner;

public class MainForVectors 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("enter dimension (2/3):");
            int length = sc.nextInt();

            double arr1[] = new double[length];
            double arr2[] = new double[length];

            System.out.println("enter elements of vector 1:");
            for(int i=0; i<length; i++)
                arr1[i] = sc.nextDouble();

            System.out.println("enter elements of vector 2:");
            for(int i=0; i<length; i++)
                arr2[i] = sc.nextDouble();

            VectorOperations v1 = new VectorOperations(arr1);
            VectorOperations v2 = new VectorOperations(arr2);

            VectorOperations sum = v1.add(v2);
            VectorOperations diff = v1.subtract(v2);
            double dot = v1.dotProduct(v2);

            System.out.println("Addition:");
            sum.printVector();

            System.out.println("Difference");
            diff.printVector();

            System.out.println("Dot Product:" + dot);
        }

        catch(InputMismatchException e)
        {
            System.out.println("invalid numeric input");
        }
        catch(CheckDimensionsException e)
        {
            System.out.println("Error:" + e.getMessage());
        }

        finally
        {
            sc.close();
        }
    }
}
