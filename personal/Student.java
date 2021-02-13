package personal;

public class Student {
    private final String name;
    public Student(){
        name = "Engineer";
    }
    public Student(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
}
