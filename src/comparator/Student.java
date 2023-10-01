/*

If we need to override the compareto method ,
we need to implement the comparable interface .

Note : Arrays.sort() also uses the compareto method ,
       hence when we declare which object variable to compare will
       be the same applied to the sorting operation.


 */





package comparator;

public class Student implements Comparable<Student> {

    int rollno ;
    int marks ;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        return this.marks - o.marks;
    }




}
