public class StudentGPA {
    private String name;
    private String major;
    private double  gpa;
    private boolean honorStatus;

    public StudentGPA(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
        this.honorStatus = false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void honorRole () {
        if (this.gpa > 3.5) {
            this.honorStatus = true;
        }
    }
}
