package _05_linearDataStructures_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_SplitByWordCasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] text = sc.nextLine().split("[ \\[\\],;\\\\:.!/()\"']+");

        List<String> loCase = new ArrayList<>();
        List<String> upCase = new ArrayList<>();
        List<String> mixCase = new ArrayList<>();

        for (String word : text) {
            boolean isMixed = false;
            for (int i = 0; i < word.length(); i++) {
                if (!Character.isLetter(word.charAt(i))) {
                    mixCase.add(word);
                    isMixed = true;
                    break;
                }
            }
            if (!isMixed && !word.equals("")) {
                if (word.toUpperCase().equals(word)) {
                    upCase.add(word);
                } else if (word.toLowerCase().equals(word)) {
                    loCase.add(word);
                } else {
                    mixCase.add(word);
                }
            }
        }

        System.out.printf("Lower-case: %s%n", String.join(", ", loCase));
        System.out.printf("Mixed-case: %s%n", String.join(", ", mixCase));
        System.out.printf("Upper-case: %s%n", String.join(", ", upCase));

    }
}

//100
