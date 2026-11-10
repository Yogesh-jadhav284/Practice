package cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course  = new Course();
        course.setCourse("Physics");
        Student originalStudent = new Student("yogesh", course);
        Student clonedStudent= (Student) originalStudent.clone();
        System.out.println(originalStudent==clonedStudent);
        System.out.println(originalStudent.getCourse()==clonedStudent.getCourse());
    }
}
