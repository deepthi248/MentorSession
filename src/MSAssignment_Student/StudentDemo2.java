package MSAssignment_Student;

public class StudentDemo2 {
    public static void main(String[] args) {

        //assigning student  marks
        int[] StudentMarks ={10,20,30,40};
        // a constructor to pass student  details
        Student student1_1 = new Student(4,StudentMarks);
        Student student1 = new Student("Dwayne Johnson",004, "Dwayne@gmail.com",
                8765432109l, (short) 13, 'M', "Manchester,USA",
                "VII");
        //setting student1 grades, marks etc
        student1.setStudentMarks(student1_1.getStudentMarks());
        student1.setStudentSubjects(student1_1.getStudentSubjects());
        //setting the grade
        student1.setGrade();


        // printing the student details
        System.out.println("Details of student with Id "+ student1.getStudentId()+
                "\n Name of the student - " +student1.getStudentName()+
                "\n Age of the student - "+ student1.getStudentAge()+
                "\n Gender of the student - "+ student1.getStudentGender()+
                "\n Email Id of the student - "+ student1.getStudentEmailId()+
                "\n Phone Number  of the student - "+ student1.getStudentPhoneNumber()+
                "\n Address of the student - "+ student1.getStudentAddress()+
                "\n Number of subjects student is pursuing - "+ student1_1.getStudentSubjects()+
                "\n Standard of the student - "+ student1.getStudentStandard() +
                "\n Student Grade is - "+student1.getGrade()

                + "\n" +"\n");

        //assigning student  details
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

        System.out.print(student3.toString());


    }

}
