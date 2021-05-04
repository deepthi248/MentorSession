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
    private int[] studentMarks;
    private Character studentGrade;

    public Student(){
        this(null,0,null,0l,(short) 0,
                ' ',null,null);

        // this(null, 0,);
    }


    //constructor for better assignment
   public Student(String studentName, int studentId, String emailId,
                   long phoneNumber, short studentAge, char studentGender,
                   String studentAddress, String studentStandard) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentEmailId = emailId;
        this.studentPhoneNumber = phoneNumber;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentAddress = studentAddress;
        this.studentStandard = studentStandard;
    }
    public Student( int studentSubjects,int[] studentMarks){

        this.studentSubjects= studentSubjects;
        this.studentMarks=studentMarks;
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
        return this.studentName;
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

    public int[] getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int[] studentMarks) {
        this.studentMarks = studentMarks;
    }

    public Character getGrade() {
        return studentGrade;
    }

    public void setGrade() {
        this.studentGrade = assignGrade(getStudentMarks());
    }
    // DRY concept
    public Character assignGrade(int[] marks){

        return assignGrade(marks,getStudentSubjects());
    }

    //calculates the average of the marks and assign a grade to the student
    //method with main functionality
    public Character assignGrade( int [] studentMarks,int studentSubjects ){
           int sum =0;
           for( int i : studentMarks){
                sum+=i;
            }
           double average = sum/studentSubjects;
           if(average>=90)
                return 'A';
           else if( average>=70 && average<=90)
                return 'B';
           else
               return 'C';
    }


}
