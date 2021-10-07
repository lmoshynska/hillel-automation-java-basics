package lesson13.Exceptions.CustomPersonValidator;

public class PersonNotEligibleException extends RuntimeException {

    PersonNotEligibleException(String message) {
        super(message);
    }

}
