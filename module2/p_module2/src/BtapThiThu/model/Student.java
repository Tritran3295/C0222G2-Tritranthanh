package BtapThiThu.model;

public class Student extends Person{
    private String level;
    private int point;
    public Student(){};

    public Student(String level, int point) {
        this.level = level;
        this.point = point;
    }

    public Student(String codePerson, String namePerson, int dateOfBirth, String gender, String level, int point) {
        super(codePerson, namePerson, dateOfBirth, gender);
        this.level = level;
        this.point = point;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return super.toString() +
                "level='" + level + '\'' +
                ", point=" + point +
                '}';
    }
}
