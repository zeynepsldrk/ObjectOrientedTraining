
public class Test {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.name = "Software Engineering";

        Professor professor1 = new Professor();
        professor1.name = "Ahmet Arslan";

        Course course1 = new Course();
        course1.name = "Int. to Software Engineering";

        Student student1 = new Student();
        student1.name = "Akin Kaldiroglu";

        // Head of Software Engineering department is Ahmet Arslan and consequently his department is Software Engineering.
        department1.head = professor1;
        professor1.department = department1;

        // Department of Int. to Software Engineering course is Software Engineering and consequently the course
        // Int. to Software Engineering belongs to Software Engineering department.
        course1.department = department1;
        department1.courses = new Course[100];
        department1.courses[0] = course1;

        course1.teacher = professor1;
        professor1.coursesGiven = new Course[5];
        professor1.coursesGiven[0] = course1;

        professor1.advisee = new Student[10];
        professor1.advisee[0] = student1;
        student1.advisor = professor1;

        student1.coursesTaken = new Course[7];
        student1.coursesTaken[0] = course1;

        course1.students = new Student[100];
        course1.students[0] = student1;

        System.out.println(student1.getName() + "' s first course is " + student1.coursesTaken[0].name);
        System.out.println(student1.getName() + "'s first course's professor is " + student1.coursesTaken[0].teacher.name);
        System.out.println(student1.getName() + "'s first course's professor's department is " + student1.coursesTaken[0].teacher.department.name);

        System.out.println("**********************************************************");

        /* We have three students: Zeynep Gül, Ali Kaya, and Murat Yilmaz.
        They are studying philosophy, but Zeynep Gül has a double major in Software Engineering and Philosophy.
                Two new professors, Ayse Fatma and Ali Veli, have joined.
                There are also two new lectures: Ontology and Ethics. */
        //new department
        Department department2 = new Department();
        department2.name = "Philosophy";

        //new professors
        Professor professor2 = new Professor();
        professor2.name = "Ayşe Fatma";

        Professor professor3 = new Professor();
        professor3.name = "Ali Veli";

        //new students
        Student student2 = new Student();
        student2.name = "Zeynep Gül";

        Student student3 = new Student();
        student3.name = "Ali Kaya";

        Student student4 = new Student();
        student4.name = "Murat Yılmaz";

        //new courses
        Course course2 = new Course();
        course2.name = "Ethics";

        Course course3 = new Course();
        course3.name = "Ontology";

        //a head of new philosophy department is Ayşe Fatma . Her department is philosophy
        department2.head = professor2;
        professor2.department = department2;


        //Department of ontology and ethics courses is philosophy thus these courses belong to philosophy department
        course2.department = department2;
        course3.department = department2;

        // department of philo. has ontology, ethics
        department2.courses = new Course[50];
        department2.courses[0] = course2;
        department2.courses[1] = course3;

        //Ayşe fatma teaches ethics
        course2.teacher = professor2;
        professor2.department = department2;
        professor2.coursesGiven = new Course[5];
        professor2.coursesGiven[0] = course2;

        //Ali Veli teaches ethics and ontology
        course3.teacher = professor3;
        professor3.department = department2;
        professor3.coursesGiven = new Course[5];
        professor3.coursesGiven[0] = course3;
        professor3.coursesGiven[1] = course2;

        //Ayşe Fatma is mentoring Zeynep Gül
        professor2.advisee = new Student[10];
        professor2.advisee[0] = student2;
        student2.advisor = professor2;

        //Ali Veli is mentoring Ali Kaya and Murat Yılmaz
        professor3.advisee = new Student[10];
        professor3.advisee[0] = student3;
        professor3.advisee[1] = student4;
        student3.advisor = professor3;
        student4.advisor = professor3;

        //Zeynep Gül has a double major, so she takes all courses; consequently, all courses have Zeynep Gül as a student.
        student2.coursesTaken = new Course[7];
        student2.coursesTaken[0] = course1;
        student2.coursesTaken[1] = course2;
        student2.coursesTaken[2] = course3;

        //for Ali Kaya
        student3.coursesTaken = new Course[7];
        student3.coursesTaken[0] = course2;
        student3.coursesTaken[1] = course3;

        //for Murat Yılmaz
        student4.coursesTaken = new Course[7];
        student4.coursesTaken[0] = course2;
        student4.coursesTaken[1] = course3;

        course1.students[1] = student2;

        //Ethics has Zeynep Gül, Ali Kaya, Murat Yılmaz as a students
        course2.students = new Student[100];
        course2.students[0] = student2;
        course2.students[1] = student3;
        course2.students[2] = student4;

        //Ontology has Zeynep Gül, Ali Kaya, Murat Yılmaz as a students
        course3.students = new Student[100];
        course3.students[0] = student2;
        course3.students[1] = student3;
        course3.students[2] = student4;

        System.out.println(student2.getName() + "'s all courses is " + student2.coursesTaken[0].name + ", " + student2.coursesTaken[1].name + ", " + student2.coursesTaken[2].name);
        System.out.println(student2.getName() + "'s all courses's professor is " + student2.coursesTaken[0].teacher.name + ", " + student2.coursesTaken[1].teacher.name + ", " + student2.coursesTaken[2].teacher.name);
        System.out.println(student2.getName() + "'s all courses's professor's department is " + student2.coursesTaken[0].teacher.department.name + ", " + student2.coursesTaken[1].teacher.department.name + ", " + student2.coursesTaken[2].teacher.department.name);

        System.out.println("*************************************************");

        /*Create a new student, student takes four courses and any coures has a own classroom
        * print new student's informations
        * make relation between courses and classrooms */

        Student student5 = new Student();
        student5.name = "Sarah";

        Classroom classr1 = new Classroom();
        classr1.name = "a_301";
        Classroom classr2 = new Classroom();
        classr2.name = "a_302";
        Classroom classr3 = new Classroom();
        classr3.name = "a_303";
        Classroom classr4 = new Classroom();
        classr4.name = "a_304";


        Course course4 = new Course();
        course4.name = "Art";
        course4.classroom = classr1;
        course1.classroom = classr2;
        course2.classroom = classr3;
        course3.classroom = classr4;

        course4.students = new Student[5];
        course4.students[0] = student4;
        course4.students[1] = student1;
        course4.students[2] = student2;

        student5.coursesTaken = new Course[3];
        student5.coursesTaken[0] = course4;
        student5.coursesTaken[1] = course2;


        System.out.println("New student " + student5.getName() + " has some lectures: " + student5.coursesTaken[0].name + ", " + student5.coursesTaken[1].name);
        System.out.println(student5.coursesTaken[0].name + " in " + student5.coursesTaken[0].classroom.name + " and " + student5.coursesTaken[1].name + " in " + student5.coursesTaken[1].classroom.getName());

    }
}
