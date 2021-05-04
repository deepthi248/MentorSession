package MSAssignment;

public class StudentDemo2 {
    public static void main(String[] args) {
        Student student1 = new Student("Dwayne Johnson", 004, "Dwayne@gmail.com",
                8765432109l, (short) 13, 'M', "Manchester,USA",
                "VII", 5);

        System.out.println("Details of student with Id "+ student1.getStudentId()+
                "\n Name of the student -" +student1.getStudentName()+
                "\n Age of the student - "+ student1.getStudentAge()+
                "\n Gender of the student -"+ student1.getStudentGender()+
                "\n Email Id of the student -"+ student1.getEmailId()+
                "\n Phone Number  of the student -"+ student1.getPhoneNumber()+
                "\n Address of the student -"+ student1.getStudentAddress()+
                "\n Number of subjects student is pursuing -"+ student1.getStudentSubjects()+
                "\n Standard of the student -"+ student1.getStudentStandard() + "\n" +"\n");


        Student student2 = new Student("Jennifer Lawrence", 005, "Jennifer@gmail.com",
                8978654310l, (short) 13, 'F', "Indian Hills ,Kentucky, USA",
                "VII", 5);
        System.out.print(student2.toString());

        Student student3 = new Student("Kate Winslet", 003, "Katey@gmail.com",
                8978654310l, (short) 14, 'F', "reading, UK",
                "VII", 5);
        System.out.print(student3.toString());


    }

}
