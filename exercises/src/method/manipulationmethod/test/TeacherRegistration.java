package method.manipulationmethod.test;

import method.manipulationmethod.domain.Teacher;

public class TeacherRegistration {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Teacher teacher01 = new Teacher();

        teacher.setName("Amelly");
        teacher.setSchoolSubject("English");
        teacher.setAge(25);
        teacher.setGender('F');

        teacher01.setName("Harry");
        teacher01.setSchoolSubject("Maths");
        teacher01.setAge(30);
        teacher01.setGender('M');

        teacher.print();
        teacher01.print();
    }
}
