package _05_linearDataStructures_Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _09_MathPotato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> child = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new));
        int n = Integer.parseInt(sc.nextLine());

        int count = 1;
        while (child.size() > 1) {

            for (int i = 1; i < n; i++) {
                child.offer(child.poll());
            }

            if (isPrime(count)) {
                System.out.println("Prime " + child.peek());
            } else {
                System.out.println("Removed " + child.poll());
            }
            count++;
        }
        System.out.println("Last is " + child.poll());
    }


    private static boolean isPrime(int n) {
        boolean primeCheck = true;
        if (n == 0 || n == 1) {
            primeCheck = false;
            return primeCheck;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primeCheck = false;
                }
            }
            return primeCheck;
        }
    }
}

//100
