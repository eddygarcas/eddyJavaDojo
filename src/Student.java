/**
 * Created by eddy on 11/29/16.
 */
public class Student extends Person implements Comparable<Student>{

    private int classNumber;

    public Student(int id) {
        super(id);
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public int compareTo(Student student) {
        return 0;
    }

    public boolean equals(Object student) {
        boolean flag = true;
        if (student instanceof Student) {
            flag = !super.equals(student) ? false : flag;
            flag = ((Student) student).getClassNumber() != this.getClassNumber() ? false : flag;
        } else flag = false;
        return flag;
    }
}
