package ecommerce_search;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Laptop", 60000),
            new Product("Phone", 30000),
            new Product("Tablet", 20000),
            new Product("Monitor", 15000)
        };

        String searchKey = "Phone";

        int linearIndex = Search.linearSearch(products, searchKey);
        System.out.println("Linear Search: " + (linearIndex != -1 ? "Found at index " + linearIndex : "Not Found"));

        int binaryIndex = Search.binarySearch(products, searchKey);
        System.out.println("Binary Search: " + (binaryIndex != -1 ? "Found at index " + binaryIndex : "Not Found"));
    }
}

