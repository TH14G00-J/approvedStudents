package entities;

public class Student {
    private final String name;
    private final double np1;
    private final double np2;

    public Student(String name, double np1, double np2) {
        this.name = name;
        this.np1 = np1;
        this.np2 = np2;
    }

    public String getName() {

        return name;
    }

    public double getNp1() {
        return np1;
    }

    public double getNp2() {
        return np2;
    }

    public double getAverage() {
        return (np1 + np2) / 2;
    }
}
