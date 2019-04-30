package _06_linearDataStructures_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class _16_PoisonousPlants {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String[] plants = reader.readLine().split("\\s+");
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(0);

        int[] days = new int[n];

        for (int i = 0; i < n; i++) {
            int maxDays = 0;

            while (!s.isEmpty() && Integer.parseInt(plants[s.peek()]) >= Integer.parseInt(plants[i])) {
                maxDays = Math.max(maxDays, days[s.pop()]);
            }

            if (!s.isEmpty()) {
                days[i] = maxDays + 1;
            }

            s.push(i);
        }
        System.out.println(max(days));
    }

    private static int max(int[] days) {
        int max = Integer.MIN_VALUE;
        for (int day : days) {
            if (day > max) {
                max = day;
            }
        }
        return max;
    }
}

//100 - by BR
//77/88 - by Scanner

