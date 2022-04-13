package ss8_clean_code_refactoring.BaiTap;

import java.util.Scanner;

public class Refactoring {
    public static final char ZERO = 0;
    public static final char ONE = 1;
    public static final char TWO = 2;
    public static final char THREE = 3;

    public static String getScore(String playerName1, String playerName2, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore;
        if(scorePlayer1 == scorePlayer2){
            switch (scorePlayer1){
                case ZERO:
                    return "Love-All";
                case ONE:
                    return "Fifteen-All";
                case TWO:
                    return "Thirty-All";
                case THREE:
                    return "Forty-All";
                default:
                    return "Deuce";
            }
        }
        else if(scorePlayer1>=4 ||  scorePlayer2 >=4){
            int minusResult = scorePlayer1 - scorePlayer2;
            if(minusResult == 1)score = "Advantage player1";
            else if(minusResult==-1) score ="Advantage player2";
            else if(minusResult>=2) score="Win for player1";
            else score="Win for player 2";
        }
        else {
            for (int i = 1; i < 3 ; i++) {
                if(i==1) tempScore = scorePlayer1;
                else {
                    score = "-";
                    tempScore=scorePlayer2;
                }switch (tempScore){
                    case ZERO:
                        return "Love";
                    case ONE:
                        return "Fifteen";
                    case TWO:
                        return "Thirty";
                    case THREE:
                        return "Forty";
                }
            }
        }return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player 1: ");
        String playerName1=scanner.nextLine();
        System.out.print("Enter player 1: ");
        String playerName2=scanner.nextLine();
        System.out.print("Enter score player 1 : ");
        int scorePlayer1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter score player 2 : ");
        int scorePlayer2 = Integer.parseInt(scanner.nextLine());
        System.out.println(Refactoring.getScore( playerName1, playerName2, scorePlayer1, scorePlayer2));
    }
}
