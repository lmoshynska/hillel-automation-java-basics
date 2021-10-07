package lesson13.Exceptions.CustomPersonValidator;

public class PersonValidation {

    int age;
    int weight;

    PersonValidation(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public void validate() {
        /*try{
            if(this.age < 18 || this.weight > 100) {
                throw new PersonNotEligibleException("You're not eligible to parachute jumping");
            } else {
                System.out.println("You're good to jump");
            }
        } catch(PersonNotEligibleException ex) {
            System.out.println(ex.getMessage());
        }*/
        if(this.age < 18 || this.weight > 100) {
            throw new PersonNotEligibleException("You're not eligible to parachute jumping");
        } else {
            System.out.println("You're good to jump");
        }
    }

    public static void main(String[] args) {

        PersonValidation person1 = new PersonValidation(18,45);
        PersonValidation person2 = new PersonValidation(15,45);
        PersonValidation person3 = new PersonValidation(45,101);

        PersonValidation[] persons = {person1, person2, person3};

        try{
            person1.validate();
            person2.validate();
            person3.validate();
        } catch(PersonNotEligibleException ex) {
            System.out.println(ex.getMessage());
        }


        /*try {
            person1.validate();
            person2.validate();
            person3.validate();
        } catch(PersonNotEligibleException ex) {
            System.out.println(ex.getMessage());
        }*/

        for (PersonValidation person : persons) {
            try {
                person.validate();
            } catch(PersonNotEligibleException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
