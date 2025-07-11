package singletonpattern;

public class Logger {
    private static Logger instance;
    private Logger() {
        System.out.printf("%s%n", "Logger instance created.");
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}