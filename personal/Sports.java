package personal;

public class Sports {

    public void m1() {
        System.out.print("Play ");
    }

    public void m2() {
        System.out.print("Fair ");
    }

    public String toString() {
        return "OLEY";
    }
}

class Basketball extends Sports {

    public void m2() {
        super.m2();
        System.out.print("Basketball ");
    }
}

class Team extends Basketball {

    public void m2() {
        super.m2();
        System.out.print("Blue ");
    }

    public String toString() {
        return "Team " + super.toString();
    }
}
