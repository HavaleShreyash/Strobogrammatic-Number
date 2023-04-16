//Java code to implement strobogrammatic number
import java.util.*;

public class StrobogrammaticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input from the user
        System.out.println("Enter the number");
        String num = sc.next();
        //Calling the function
        System.out.println("Is the number strobogrammatic?- " + isStrobogrammatic(num));
        // System.out.println(isStrobogrammatic(num));
        sc.close();
    }

    public static boolean isStrobogrammatic(String num) {
        //Creating a hashmap with key as the number and value as the number that can be rotated 180 degrees
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');
        //Creating two pointers i and j. i will point to the first element and j will point to the last element
        int i = 0;
        int j = num.length() - 1;
        //Checking if the number at i is present in the hashmap and if the value of the number at i is equal to the number at j
        while (i <= j) {
            //If the number at i is not present in the hashmap or the value of the number at i is not equal to the number at j, return false
            if (!map.containsKey(num.charAt(i)) || map.get(num.charAt(i)) != num.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}

/*
 Algorithm:
1. Create a hashmap with key as the number and value as the number that can be rotated 180 degrees.
2. Create two pointers i and j. i will point to the first element and j will point to the last element.
3. Check if the number at i is present in the hashmap and if the value of the number at i is equal to the number at j.
4. If the number at i is not present in the hashmap or the value of the number at i is not equal to the number at j, return false.
5. If the number at i is present in the hashmap and the value of the number at i is equal to the number at j, increment i and decrement j.
6. If the loop terminates, return true.
 */