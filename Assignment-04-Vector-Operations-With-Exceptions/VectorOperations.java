import java.util.Arrays;

public class VectorOperations 
{
    private double[] v1;

    // constructor
    public VectorOperations(double[] v) throws CheckDimensionsException
    {
        if(v==null || v.length==0)
            throw new CheckDimensionsException("invalid vector components");

        if(v.length!=2 && v.length!=3)
            throw new CheckDimensionsException("only 2D and 3D vectors are allowed");

        v1 = v.clone();
    }

    // method to check dimension compatibility
    private void checkDimensions(VectorOperations other) throws CheckDimensionsException
    {
        if(this.v1.length != other.v1.length)
            throw new CheckDimensionsException("vectors must have same dimensions.");
    }

    // add vectors
    public VectorOperations add(VectorOperations other) throws CheckDimensionsException
    {
        checkDimensions(other);
        
        double[] sum = new double[v1.length];
        for(int i=0; i<v1.length; i++)
            sum[i] = this.v1[i] + other.v1[i];
        return new VectorOperations(sum);
    }

    // subtract vectors
    public VectorOperations subtract(VectorOperations other) throws CheckDimensionsException
    {
        checkDimensions(other);
        
        double[] diff = new double[v1.length];
        for(int i=0; i<v1.length; i++)
            diff[i] = this.v1[i] - other.v1[i];
        return new VectorOperations(diff);
    }

    // dot product
    public double dotProduct(VectorOperations other) throws CheckDimensionsException
    {
        checkDimensions(other);

        double dot = 0;
        for(int i=0; i<v1.length; i++)
            dot += this.v1[i] * other.v1[i];
        return dot;
    }

    // print vector
    public void printVector()
    {
        System.out.println(Arrays.toString(v1));
    }
}
