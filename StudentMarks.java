package assignment_18_05;

public class StudentMarks {
    Double maths;
    Double science;
    Double social;
    Double english;

    public StudentMarks(Double maths, Double science, Double social, Double english) {
        this.maths = maths;
        this.science = science;
        this.social = social;
        this.english = english;
    }

    public Double getMaths() {
        return maths;
    }

    public void setMaths(Double maths) {
        this.maths = maths;
    }

    public Double getScience() {
        return science;
    }

    public void setScience(Double science) {
        this.science = science;
    }

    public Double getSocial() {
        return social;
    }

    public void setSocial(Double social) {
        this.social = social;
    }

    public Double getEnglish() {
        return english;
    }

    public void setEnglish(Double english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "maths=" + maths +
                ", science=" + science +
                ", social=" + social +
                ", english=" + english +
                '}';
    }
}
