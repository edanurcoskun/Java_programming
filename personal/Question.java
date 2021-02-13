package personal;

public class Question {
    public static void main(String[] args) {
        Rectangle c = new Rectangle(4,20);
    }
}

class Shape{
    int size;
    public Shape(int size){
        this.size = size;
    }
    public String toString(){
        return " size of the sape " + size;
    }
}

class Rectangle extends Shape{
    int length;
    public Rectangle(int s, int length){
        super(s);
        this.length=length;
    }
    @Override
    public String toString(){
        return super.toString() + "\nlength is" + length;
    }
    
}
