package study.viradonojiraya.day6.interfaces.domain.interfaces;

public interface DataLoader {
    int MAX_DATA_SIZE = 10; // interface's attributes are public, statics and finals by default
    void load(); // java's interfaces are abstracts and public by default

    // Using the default keyword, we can implement this interface without implementing this method
    // Now this method is concrete
    default void checkPermission() {
        System.out.println("Checking permission...");
    }
}
