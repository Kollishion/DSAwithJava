public class Main{
    public static void main(String args[]){
        Student student1 = new Student("Spongebob", 30, 3.7);
        Student student2 = new Student("Patrick", 34, 2.0);
        Student student3 = new Student("Sandy", 27, 4.0);
        //Student 1 details
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        //Student 2 details
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        //Student 3 Details
        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        //Method inside another class showcase
        student1.study();
        student2.study();
        student3.study();
    }
}