package MSAssignment_Student;

public class Student {
    //instance variables -- state of the object
    private String studentName;
    private int studentId;
    private String studentEmailId;
    private long studentPhoneNumber;
    private short studentAge;
    private char studentGender;
    private String studentAddress;
    private String studentStandard;
    private int studentSubjects;

    //constructor for better assignment
   public Student(String studentName, int studentId, String emailId,
                   long phoneNumber, short studentAge, char studentGender,
                   String studentAddress, String studentStandard, int studentSubjects) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentEmailId = emailId;
        this.studentPhoneNumber = phoneNumber;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentAddress = studentAddress;
        this.studentStandard = studentStandard;
        this.studentSubjects = studentSubjects;
    }

    //printing the details
    public String toString(){
        return   "Details of student with Id "+this.studentId+
                "\n Name of the student - " +this.studentName +
                "\n Age of the student - "+ this.studentAge+
                "\n Gender of the student - "+this.studentGender+
                "\n Email Id of the student - "+this.studentEmailId +
                "\n Phone Number  of the student - "+ this.studentPhoneNumber+
                "\n Address of the student - "+ this.studentAddress+
                "\n Number of subjects student is pursuing - "+ this.studentSubjects+
                "\n Standard of the student - "+this.studentStandard + "\n" +"\n"  ;

    }
    //action of the object

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

    public String getStudentEmailId() {
        return studentEmailId;
    }

    public void setStudentEmailId(String studentEmailId) {
        this.studentEmailId = studentEmailId;
    }

    public long getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(long studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
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
