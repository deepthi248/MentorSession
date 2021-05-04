package MSAssignment;

public class Student {
    private String studentName;
    private int studentId;
    private String emailId;
    private long phoneNumber;
    private short studentAge;
    private char studentGender;
    private String studentAddress;
    private String studentStandard;
    private int studentSubjects;

    public Student(String studentName, int studentId, String emailId,
                   long phoneNumber, short studentAge, char studentGender,
                   String studentAddress, String studentStandard, int studentSubjects) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentAddress = studentAddress;
        this.studentStandard = studentStandard;
        this.studentSubjects = studentSubjects;
    }

    public String toString(){
        return   "Details of student with Id "+this.studentId+
                "\n Name of the student -" +this.studentName +
                "\n Age of the student - "+ this.studentAge+
                "\n Gender of the student -"+this.studentGender+
                "\n Email Id of the student -"+this.emailId +
                "\n Phone Number  of the student -"+ this.phoneNumber+
                "\n Address of the student -"+ this.studentAddress+
                "\n Number of subjects student is pursuing -"+ this.studentSubjects+
                "\n Standard of the student -"+this.studentStandard + "\n" +"\n"  ;

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public short getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(short studentAge) {
        this.studentAge = studentAge;
    }

    public char getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(char studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentStandard() {
        return studentStandard;
    }

    public void setStudentStandard(String studentStandard) {
        this.studentStandard = studentStandard;
    }

    public int getStudentSubjects() {
        return studentSubjects;
    }

    public void setStudentSubjects(int studentSubjects) {
        this.studentSubjects = studentSubjects;
    }



}
