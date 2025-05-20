package study.random.OOP4;

public interface Person {
    // static final by default
    public static final String NICE_PHRASE = "All people are the same!";

    default void showNicePhrase() {
        System.out.println(NICE_PHRASE);
    }

    void presentation();
}
