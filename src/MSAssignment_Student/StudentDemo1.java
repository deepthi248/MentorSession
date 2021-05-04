package MSAssignment_Student;
//using getters and setters
public class StudentDemo1 {
    public static void main(String[] args){
        //setting the values
        Student student1 = new Student(); //student 1
        student1.setStudentId(001);
        student1.setStudentName("Christopher Nolan");
        student1.setStudentGender('M');
        student1.setStudentAge((short) 12);
        student1.setStudentEmailId("Nolan@gmail.com");
        student1.setStudentPhoneNumber(9898989898l);
        student1.setStudentAddress("Westminster,London,UK ");
        student1.setStudentSubjects(5);
        student1.setStudentStandard("V");

        //printing student details using getters
        System.out.println("Details of student with Id "+ student1.getStudentId()+
                "\n Name of the student -" +student1.getStudentName()+
                "\n Age of the student - "+ student1.getStudentAge()+
                "\n Gender of the student - "+ student1.getStudentGender()+
                "\n Email Id of the student - "+ student1.getStudentEmailId()+
                "\n Phone Number  of the student - "+ student1.getStudentPhoneNumber()+
                "\n Address of the student - "+ student1.getStudentAddress()+
                "\n Number of subjects student is pursuing - "+ student1.getStudentSubjects()+
                "\n Standard of the student - "+ student1.getStudentStandard()+"\n" +"\n" );



        Student student2 = new Student(); //student 2
        student2.setStudentId(002);
        student2.setStudentName("Johnny Dep");
        student2.setStudentGender('M');
        student2.setStudentAge((short) 14);
        student2.setStudentEmailId("Johnny@gmail.com");
        student2.setStudentPhoneNumber(9897897890l);
        student2.setStudentAddress("Holly Wood, Los Angeles,California, USA ");
        student2.setStudentSubjects(6);
        student2.setStudentStandard("VIII");

        //printing student details using getters
        System.out.println("Details of student with Id "+ student2.getStudentId()+
                "\n Name of the student - " +student2.getStudentName()+
                "\n Age of the student - "+ student2.getStudentAge()+
                "\n Gender of the student - "+ student2.getStudentGender()+
                "\n Email Id of the student - "+ student1.getStudentEmailId()+
                "\n Phone Number  of the student - "+ student1.getStudentPhoneNumber()+
                "\n Address of the student - "+ student2.getStudentAddress()+
                "\n Number of subjects student is pursuing - "+ student2.getStudentSubjects()+
                "\n Standard of the student - "+ student2.getStudentStandard() +"\n" +"\n" );


        Student student3 = new Student(); //student 3
        student3.setStudentId(003);
        student3.setStudentName("Angelina Jolie");
        student3.setStudentGender('F');
        student3.setStudentAge((short) 15);
        student3.setStudentEmailId("Jolie@gmail.com");
        student3.setStudentPhoneNumber(9567812340l);
        student3.setStudentAddress("Los Angeles,California, USA");
        student3.setStudentSubjects(8);
        student3.setStudentStandard("IX");

        //printing student details using getters
        System.out.println("Details of student with Id "+ student3.getStudentId()+
                "\n Name of the student - " +student3.getStudentName()+
                "\n Age of the student - "+ student3.getStudentAge()+
                "\n Gender of the student - "+ student3.getStudentGender()+
                "\n Email Id of the student - "+ student1.getStudentEmailId()+
                "\n Phone Number  of the student - "+ student1.getStudentPhoneNumber()+
                "\n Address of the student - "+ student3.getStudentAddress()+
                "\n Number of subjects student is pursuing - "+ student3.getStudentSubjects()+
                "\n Standard of the student - "+ student3.getStudentStandard() + "\n" +"\n");


    }
}