package _05_linearDataStructures_Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _08_HotPotato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> child = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new));
        int n = Integer.parseInt(sc.nextLine());

        while (child.size() > 1) {
            for (int i = 1; i < n; i++) {
                child.offer(child.poll());
            }
            System.out.println("Removed " + child.poll());
        }
        System.out.println("Last is " + child.poll());
    }
}

//100