package Sorting_Comparing;

public class Student implements Comparable<Student> {
     String name;
     int id;
     int marks;

    public Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                '}';
    }
    @Override
    public int compareTo(Student o){
            int marksCompare = Integer.compare(this.marks, o.marks);
            return marksCompare;
    }
}
