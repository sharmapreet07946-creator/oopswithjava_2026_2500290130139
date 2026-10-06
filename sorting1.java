import java.util.*;
class Student{
    int marks;
    String name;
    int rollNo;
    Student(int marks,String name,int rollNo){
        this.marks=marks;
        this.rollNo=rollNo;
        this.name=name;
    }
}
class studentComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.marks!=s2.marks){
            return s2.marks-s1.marks;
        }
        else{
            return s1.rollNo-s2.rollNo;
        }
    }
}
public class sorting1{
    public static void main(String[] args){
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(60,"Nivea",112));
        students.add(new Student(70,"Preet",127));
        students.add(new Student(60,"Kushal",113));
        students.add(new Student(80,"Lalit",117));
        students.add(new Student(100,"Kartik",115));
        Collections.sort(students,new studentComparator());

        for(Student s:students){
            System.out.println(s.marks+" "+s.rollNo+" "+s.name);
        }
    }
    

}