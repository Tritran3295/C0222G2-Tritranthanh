package BtapThiThu.model;

public class Teacher extends Person{
    private String specialize;
    public Teacher(){};

    public Teacher(String specialize) {
        this.specialize = specialize;
    }

    public Teacher(String codePerson, String namePerson, int dateOfBirth, String gender, String specialize) {
        super(codePerson, namePerson, dateOfBirth, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return super.toString() +
                "specialize='" + specialize + '\'' +
                '}';
    }
}
