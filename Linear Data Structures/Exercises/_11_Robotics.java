package _06_linearDataStructures_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _11_Robotics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(";");
        String[] robots = new String[input.length]; //  robots names
        int[] needTime = new int[input.length];  //  single robot time
        int[] counter = new int[input.length];        //  counter

        for (int i = 0; i < input.length; i++) {
            String[] robotData = input[i].split("-");
            robots[i] = robotData[0];   //  fill robots collection
            needTime[i] = Integer.parseInt(robotData[1]);   //  fill single robot's time collection with the same index
        }

        //  manage the time variables:
        String[] startTime = sc.nextLine().split(":");
        int h = Integer.parseInt(startTime[0]) * 60 * 60;
        int m = Integer.parseInt(startTime[1]) * 60;
        int s = Integer.parseInt(startTime[2]);
        long totalS = h + m + s;

        ArrayDeque<String> products = new ArrayDeque<>();
        String product = "";
        while (!"End".equals(product = sc.nextLine())) {
            products.add(product);  //  fill products in Queue
        }

        //  main logic here:
        while (!products.isEmpty()) {
            totalS++;
            for (int i = 0; i < counter.length; i++) {
                //  if robot is busy:
                if (counter[i] > 0) {
                    counter[i]--;   //  decrease counter for it
                }
            }
            String currProd = products.poll();
            boolean isTaken = false;
            for (int i = 0; i < robots.length; i++) {
                if (counter[i] == 0) {
                    // robot is idle
                    counter[i] = needTime[i];
                    isTaken = true;
                    System.out.printf("%s - %s [%s]%n", robots[i], currProd, convertTime(totalS));
                    break;
                }
            }
            if (!isTaken) {
                //  robot is not idle
                products.add(currProd);
            }
        }
    }

    public static String convertTime(long totalS) {

        long s = totalS % 60;
        long m = (totalS / 60) % 60;
        long h = (totalS / (60 * 60)) % 24;

        return String.format("%02d:%02d:%02d", h, m, s);
    }
}

//100
