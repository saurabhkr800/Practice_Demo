package assignment_18_05;



public class Student extends StudentMarks {
    Integer studentId;
    String studentName;
    String studentBranch;

    public Student( Integer studentId, String studentName, String studentBranch,Double maths, Double science, Double social, Double english) {
        super(maths, science, social, english);
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentBranch = studentBranch;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentBranch='" + studentBranch + '\'' +
                ", maths=" + maths +
                ", science=" + science +
                ", social=" + social +
                ", english=" + english +
                '}';
    }
    @Override
    public int hashCode() {
        return this.studentId;
    }
    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return !(this.studentId==student.getStudentId());
    }




}
