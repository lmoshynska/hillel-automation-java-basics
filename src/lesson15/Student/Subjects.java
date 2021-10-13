package lesson15.Student;

public enum Subjects {

    COMPUTER_SCIENCE("Computer Science"),
    MATH("Math"),
    HISTORY("History"),
    PHILOSOPHY("Philosophy"),
    ENGLISH("English");

    private String name;

    Subjects(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
