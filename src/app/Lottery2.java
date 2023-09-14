package app;

import java.util.Scanner;

public class Lottery2 {
    private final static int winnerNum = 56;

    public static void main(String[] args) {

        int[][] lotteryTicket = {{31, 2, 99, 50}, {51, 87, 56, 42}, {10, 7, 84, 19}, {10, 3, 18, 23}};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int search = scanner.nextInt();

        int count = -1;

        for (int i = 0; i < lotteryTicket.length; i++) {
            for (int j = 0; j < lotteryTicket[i].length; j++)
                if (lotteryTicket[i][j] == search)
                    count = i;
        }

        if (count > -1 & search == winnerNum)
            System.out.print("Number " + search + " is winner");
        else
            System.out.print("Number " + search + " is not winner");
    }
}
