public class Student 
{
    int studentId;
    String name;
    String branch;
    int marks1, marks2, marks3, marks4, marks5;
    double percentage;

    public Student(int studentId, String name, String branch,
                   int m1, int m2, int m3, int m4, int m5, double percentage) 
    {
        this.studentId = studentId;
        this.name = name;
        this.branch = branch;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
        this.marks4 = m4;
        this.marks5 = m5;
        this.percentage = percentage;
    }

    // Convert object → CSV row
    public String toCSV() 
    {
        return studentId + "," + name + "," + branch + "," + marks1 + "," + marks2 + "," + marks3 + "," +
                marks4 + "," + marks5 + "," + percentage;
    }
}
