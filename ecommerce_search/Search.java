package ecommerce_search;

import java.util.Arrays;

public class Search {
    public static int linearSearch(Product[] products, String target) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].name.equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String target) {
        Arrays.sort(products, (a, b) -> a.name.compareToIgnoreCase(b.name));

        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].name.compareToIgnoreCase(target);

            if (cmp == 0) return mid;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
