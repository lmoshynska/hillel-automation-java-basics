package lesson8;

public class MainClass {

    public static void main(String[] args) {

        /*Student student1 = new Student("Peter", 25);
        Student student2 = new Student("Jane", 20);

        System.out.println("Student1: " + student1.toString());
        System.out.println("Student2: " + student2.toString());

        System.out.println("We have " + student1.getCountStudents() + " students");
        System.out.println("We have " + student2.getCountStudents() + " students");

        student1.setCountStudents(25);
        System.out.println(student2.getCountStudents());*/

//        student1 = student3;



//        student1.setName("Peter");
//
//        System.out.println("Student1: " + student1.toString());
//        System.out.println("Student3: " + student3.toString());
//
//        student3 = new Student("Jane", 20);
//
//        System.out.println("Student1: " + student1.toString());
//        System.out.println("Student3: " + student3.toString());

/*        Pet cat = new Pet(1, "Mike");
        Pet cat2 = new Pet(1, "Mike");

        System.out.println("cat == cat2: " + (cat == cat2)); // false
        System.out.println("cat.equals(cat2): " + cat.equals(cat2)); // true

        Pet cat3 = cat;

        System.out.println("cat == cat3: " + (cat == cat3)); // true
        System.out.println("cat.equals(cat3): " + cat.equals(cat3)); // true*/

//        Dog dog1 = new Dog();
//        dog1.bark();
//        dog1.sleep();

        Car car1 = new Car("Jaguar", 300000);
        Car car2 = new Car("Lada", 10000);

        car1.start();
        car1.move();
        car1.stop();

        car2.start();
        car2.move();
        car2.stop();

        Dog dog = new Dog();
    }
}
