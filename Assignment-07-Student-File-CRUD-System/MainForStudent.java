public class MainForStudent 
{
    public static void main(String[] args) 
    {
        StudentService service = new StudentService();

        service.createFile();
        service.display();

        service.addStudents();
        service.display();

        service.updateMarks();
        service.display();

        service.calculatePercentage();
        service.display();

        service.deleteStudent(3);
        service.display();

        service.showException();
    }
}
