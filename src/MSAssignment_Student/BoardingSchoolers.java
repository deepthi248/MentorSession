package MSAssignment_Student;

public class BoardingSchoolers extends Student{
    private int numberOfDays;

    public BoardingSchoolers(String studentName, int studentId, String emailId,
                             long phoneNumber, short studentAge, char studentGender,
                             String studentAddress, String studentStandard, int numberOfDays) {
        super(studentName, studentId, emailId, phoneNumber,
                studentAge, studentGender, studentAddress,
                studentStandard);
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int feesOfStudent(int numberOfDays){
        return  (numberOfDays/30)*200;
    }
}
