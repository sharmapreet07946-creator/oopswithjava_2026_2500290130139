// Case Study 5. Student Ranking System
// A college stores student details:
// •	Roll number 
// •	Name 
// •	Marks 
// Requirement:
// The Student class should implement Comparable<Student> and students should be sorted by marks in ascending order.

import java.util.*;
class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int marks;
    Student(int rollNo,String name,int marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
    public int compareTo(Student s){
        return this.marks-s.marks;
    }
}
public class sorting5{
    public static void main(String[] args){
        ArrayList<Student>students=new ArrayList<>();
        students.add(new Student(1,"Arun",50));
        students.add(new Student(2,"Anuj",100));
        students.add(new Student(3,"Bhavya",40));
        students.add(new Student(4,"Bhanu",90));
        students.add(new Student(5,"Champak",80));
        Collections.sort(students);
        for(Student s:students){
            System.out.println(s.rollNo+" "+s.name+" "+s.marks);
        }
    }
}