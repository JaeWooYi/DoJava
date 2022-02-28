package sec15_inheritancePolymorphism.i01_Inheritance;

class Human{
    // 일단 필드 2개
    String name;
    int age;

    // 일단 메서드 2개
    void eat(){}
    void sleep(){}
}

class Student extends Human{
    String studentID;
    void goToSchool(){}
}

class Worker extends Human{
    String workerId;
    void goToWork(){}
}

public class ex01_inheritance {
    public static void main(String[] args){
        // 1. Human객체 생성
        Human human = new Human();
        human.name = "JW";
        human.age = 15;
        human.eat();
        human.sleep();

        // 2. Student객체 생성
        Student student = new Student();
        student.name = "kkk";
        student.age = 10;
        student.studentID = "kkk11";
        student.eat();
        student.sleep();
        student.goToSchool();

        // 3. Worker객체 생성
        Worker worker = new Worker();
        worker.name = "jjj";
        worker.age = 20;
        worker.workerId ="jjj0101";
        worker.eat();
        worker.sleep();
        worker.goToWork();
    }
}
