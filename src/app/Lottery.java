package app;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        int[][] lotteryTicket = {{31, 2, 99, 50}, {51, 87, 56, 42}, {10, 7, 84, 19}, {10, 3, 18, 23}};
        int count = 0;
        int winNum = getWinNumber();
        checkLotteryTicket(lotteryTicket, winNum, count);

    }

    private static int getWinNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the winning number: ");
        return scanner.nextInt();
    }

    private static void checkLotteryTicket(int[][] lotteryTicket, int winNum, int count) {
        for (int[] num1 : lotteryTicket) {
            for (int num : num1) {
                if (num == winNum) {
                    count++;
                }
            }
        }
        if (count > 0)
            System.out.println("\nCongratulations! \nThe winning number " + winNum + " has been found. You are the winner!");
        else
            System.out.println("The winning number " + winNum + " was not found. We wish you good luck next time.");
    }


}
