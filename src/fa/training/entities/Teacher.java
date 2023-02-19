package fa.training.entities;

public abstract class Teacher {
    protected String designation;
    protected String collegename;
    public Teacher() {
    }

    public Teacher(String designation, String collegename) {
        super();
        this.designation = designation;
        this.collegename = collegename;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCollegeName() {
        return collegename;
    }

    public void setCollegeName(String collegeName) {
        this.collegename = collegeName;
    }
    public abstract void teach();
}
