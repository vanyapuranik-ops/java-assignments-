import java.io.*;
import java.util.*;

public class StudentService 
{
    String fileName = "Students.csv";

    // create file + header + initial rows
    public void createFile() 
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) 
        {
            bw.write("studentId,name,branch,marks1,marks2,marks3,marks4,marks5,percentage");
            bw.newLine();

            bw.write("1,Spandana,AIML,80,85,90,75,88,0");
            bw.newLine();

            bw.write("2,Rahul,CSE,70,65,60,55,50,0");
            bw.newLine();

            System.out.println("File created with initial rows.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error while creating file: " + e.getMessage());
        }
    }

    // add 3 new students (marks4 & marks5 = 0)
    public void addStudents() 
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) 
        {
            bw.write("3,Amit,IT,78,82,80,0,0,0");
            bw.newLine();

            bw.write("4,Sneha,ECE,88,90,85,0,0,0");
            bw.newLine();

            bw.write("5,Kiran,ME,60,65,70,0,0,0");
            bw.newLine();

            System.out.println("3 new students added.");

        } 
        catch (IOException e) 
        {
            System.out.println("Error while adding students: " + e.getMessage());
        }
    }

    // read all students
    public List<Student> readStudents() 
    {
        List<Student> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) 
        {
            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) 
            {
                String[] data = line.split(",");

                Student s = new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2],
                        Integer.parseInt(data[3]),
                        Integer.parseInt(data[4]),
                        Integer.parseInt(data[5]),
                        Integer.parseInt(data[6]),
                        Integer.parseInt(data[7]),
                        Double.parseDouble(data[8]));

                list.add(s);
            }

        } 
        catch (IOException e) 
        {
            System.out.println("Error while reading file: " + e.getMessage());
        }

        return list;
    }

    // update marks 
    public void updateMarks() 
    {
        List<Student> list = readStudents();

        for (Student s : list) 
        {
            if (s.marks4 == 0) s.marks4 = 75;
            if (s.marks5 == 0) s.marks5 = 80;
        }

        writeAll(list);
        System.out.println("Marks updated.");
    }

    // calculate percentage
    public void calculatePercentage() 
    {
        List<Student> list = readStudents();

        for (Student s : list) 
        {
            int total = s.marks1 + s.marks2 + s.marks3 + s.marks4 + s.marks5;
            s.percentage = total / 5.0;
        }

        writeAll(list);
        System.out.println("Percentage calculated.");
    }

    // delete a student by ID
    public void deleteStudent(int id) 
    {
        List<Student> list = readStudents();

        list.removeIf(s -> s.studentId == id);

        writeAll(list);
        System.out.println("Student with ID " + id + " deleted.");
    }

    // helper method to rewrite file
    private void writeAll(List<Student> list) 
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) 
        {
            bw.write("studentId,name,branch,marks1,marks2,marks3,marks4,marks5,percentage");
            bw.newLine();

            for (Student s : list) 
            {
                bw.write(s.toCSV());
                bw.newLine();
            }

        } 
        catch (IOException e) 
        {
            System.out.println("Error while writing file: " + e.getMessage());
        }
    }

    // display file content
    public void display() 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                System.out.println(line);
            }

        } 
        catch (IOException e) 
        {
            System.out.println("Error while displaying file: " + e.getMessage());
        }
    }

    // force exception 
    public void showException() 
    {
        try 
        {
            BufferedReader br = new BufferedReader(new FileReader("WrongFile.csv"));
        } 
        catch (IOException e) 
        {
            System.out.println("Exception caught: File not found!");
        }
    }
}
