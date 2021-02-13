package personal;

public class JavaLevel extends Student {

    private Student javaStudent;
    private int level;

    public JavaLevel() {
        level = 0;
    }

    public JavaLevel(Student student, int level) {
        javaStudent = student;
        this.level = level;
    }

    public Student getStudent() {
        return javaStudent;
    }

    public void setStudent(Student student) {
        javaStudent = student;
    }
    
    public int getLevel() {
        return level;
    }

    public void increaseLevel() {
        level++;
    }
    
    public String toString() {
        return javaStudent.getName() + " is at level: " + level + " in Java.";
    }
}
