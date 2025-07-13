package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverseClear {
    public static void main(String[] args) {
        // Initial array of customer names
        String[] customers = { "Zahra", "David", "Mary", "Ahmed", "Beatrice" };

        // ✅ Sort the array alphabetically
        System.out.println("Sorted Customers:");
        Arrays.sort(customers);
        for (String name : customers) {
            System.out.println("-- " + name);
        }

        // ✅ Reverse the sorted array
        System.out.println("\nReversed Customers:");
        List<String> customerList = Arrays.asList(customers);
        Collections.reverse(customerList);
        for (String name : customerList) {
            System.out.println("-- " + name);
        }

        // ✅ Clear the array by resetting each element to "N/A"
        System.out.println("\nCleared Customers:");
        Arrays.fill(customers, "N/A");
        for (String name : customers) {
            System.out.println("-- " + name);
        }
    }
}