package lesson13.AccessModifiers.CarProblemSolution.Professions;

import lesson13.AccessModifiers.CarProblemSolution.Human;

public class Driver extends Human {

    String name;
    int experienceYears;

    Driver(String gender, String name, int experienceYears) {
        super(gender);
        this.name = name;
        this.experienceYears = experienceYears;
    }

    int doSth() {
        return gender.length();
    }

    /*Driver(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }*/

}
