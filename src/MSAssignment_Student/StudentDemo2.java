package MSAssignment_Student;

import MSAssignment_Customer.RegularCustomer;

public class StudentDemo2 {
    public static void main(String[] args) {

        //assigning student  marks
        int[] studentMarks ={10,20,30,40};
        // a constructor to pass student  details
        Student student1_1 = new Student(4,studentMarks);

        //setting student1 grades, marks etc


        BoardingSchoolers boardingSchoolers = new BoardingSchoolers("Dwayne Johnson",004, "Dwayne@gmail.com",
                8765432109l, (short) 13, 'M', "Manchester,USA",
                "VII",30);

        boardingSchoolers.setStudentMarks(student1_1.getStudentMarks());
        boardingSchoolers.setStudentSubjects(student1_1.getStudentSubjects());
        boardingSchoolers.setFees(boardingSchoolers.feesOfStudent(boardingSchoolers.getNumberOfDays()));
        //setting the grade
        boardingSchoolers.setGrade();

        // printing the student details
        System.out.println("Details of student with Id "+ boardingSchoolers.getStudentId()+
                "\n Name of the student - " +boardingSchoolers.getStudentName()+
                "\n Age of the student - "+ boardingSchoolers.getStudentAge()+
                "\n Gender of the student - "+ boardingSchoolers.getStudentGender()+
                "\n Email Id of the student - "+ boardingSchoolers.getStudentEmailId()+
                "\n Phone Number  of the student - "+ boardingSchoolers.getStudentPhoneNumber()+
                "\n Address of the student - "+ boardingSchoolers.getStudentAddress()+
                "\n Number of subjects student is pursuing - "+ student1_1.getStudentSubjects()+
                "\n Standard of the student - "+ boardingSchoolers.getStudentStandard() +
                "\n Student Grade is - "+boardingSchoolers.getGrade()+
                "\n Fees of Student is - "+boardingSchoolers.getFees()

                + "\n" +"\n");
        studentMarks = new int[]{90, 90, 90, 90,90};
        Student student1_2 = new Student(5, studentMarks);

        DaySchooler daySchooler= new DaySchooler("Jennifer Lawrence", 005, "Jennifer@gmail.com",
                8978654310l, (short) 13, 'F', "Indian Hills ,Kentucky, USA",
                "VII", 9, 19);

        daySchooler.setStudentMarks(student1_2.getStudentMarks());
        daySchooler.setStudentSubjects(student1_2.getStudentSubjects());
        daySchooler.setFees(daySchooler.feesOfStudent(daySchooler.getStartTime(), daySchooler.getEndTime()) );
        //setting the grade
        daySchooler.setGrade();

        // printing the student details
        System.out.println("Details of student with Id "+ daySchooler.getStudentId()+
                "\n Name of the student - " +daySchooler.getStudentName()+
                "\n Age of the student - "+ daySchooler.getStudentAge()+
                "\n Gender of the student - "+ daySchooler.getStudentGender()+
                "\n Email Id of the student - "+ daySchooler.getStudentEmailId()+
                "\n Phone Number  of the student - "+ daySchooler.getStudentPhoneNumber()+
                "\n Address of the student - "+ daySchooler.getStudentAddress()+
                "\n Number of subjects student is pursuing - "+ student1_2.getStudentSubjects()+
                "\n Standard of the student - "+ daySchooler.getStudentStandard() +
                "\n Student Grade is - "+daySchooler.getGrade()+
                "\n Fees of Student is - "+daySchooler.getFees()

                + "\n" +"\n");




       /* //assigning student  details
        Student student2 = new Student("Jennifer Lawrence", 005, "Jennifer@gmail.com",
                8978654310l, (short) 13, 'F', "Indian Hills ,Kentucky, USA",
                "VII");

        // printing the student details
        System.out.print(student2.toString());

        //assigning student  details
        Student student3 = new Student("Kate Winslet", 003, "Katey@gmail.com",
                8978654310l, (short) 14, 'F', "reading, UK",
                "VII");

        // printing the student details

        System.out.print(student3.toString());*/


    }

}
