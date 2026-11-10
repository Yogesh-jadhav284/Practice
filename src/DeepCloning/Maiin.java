package DeepCloning;

public class Maiin {
    public  static void main(String[] args){
        Course c1 = new Course();
        c1.setCourse("Bio");


        Student s1= new Student("yogesh", c1);
        Student s2 = (Student) s1.clone();
        System.out.println(s2);

        System.out.println(s1.getCourse()==s2.getCourse());
    }
}
