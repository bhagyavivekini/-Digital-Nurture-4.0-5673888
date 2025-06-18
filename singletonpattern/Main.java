package singletonpattern; 

public class Main {
    public static void main(String[] args) {
        
        Logger log1 = Logger.getInstance();
        log1.log("This is the first log message.");
        Logger log2 = Logger.getInstance();
        log2.log("This is the second log message.");
        System.out.println("Are both logger instances the same? " + (log1 == log2));
    }
}
