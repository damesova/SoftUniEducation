package _05_linearDataStructures_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _01_EncryptSortPrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] names = new String[n];

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        int[] encryptedNames = new int[names.length];

        for (int i = 0; i < names.length; i++) {
            int currentNameSum = 0;
            for (int j = 0; j < names[i].length(); j++) {

                char currentCh = names[i].charAt(j);
                if (isVowel(currentCh)) {
                    currentNameSum += currentCh * names[i].length();
                } else {
                    currentNameSum += currentCh / names[i].length();
                }
            }
            encryptedNames[i] = currentNameSum;
        }

        Arrays.sort(encryptedNames);

        for (int encryptedName : encryptedNames) {
            System.out.println(encryptedName);
        }
    }

    private static boolean isVowel(char ch) {
        char[] vowels = new char[]{'a', 'u', 'o', 'e', 'i'};

        for (char vowel : vowels) {
            if (vowel == Character.toLowerCase(ch)) {
                return true;
            }
        }
        return false;
    }
}

//100
