package MSAssignment_Student;

public class DaySchooler extends Student {
    private int startTime;
    private int endTime;


    public DaySchooler(String studentName, int studentId, String emailId, long phoneNumber, short studentAge, char studentGender, String studentAddress, String studentStandard, int startTime, int endTime) {
        super(studentName, studentId, emailId, phoneNumber, studentAge, studentGender, studentAddress, studentStandard);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public int feesOfStudent(int startTime, int endTime){
        return  ( (endTime - startTime) / 8 )* 20;
    }

}
