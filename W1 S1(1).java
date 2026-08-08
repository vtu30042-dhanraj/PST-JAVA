import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
PerformOperation isOdd() {
    return n -> n % 2 != 0;
}

PerformOperation isPrime() {
    return n -> {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    };
}

PerformOperation isPalindrome() {
    return n -> {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + (n % 10);
            n /= 10;
        }

        return original == reverse;
    };
  }
}
   // Write your code here

public class Solution {
