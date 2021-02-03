package main.java;
import java.text.MessageFormat;

public class Match {
    private Player player1;
    private Player player2;
    private String _result;

    public Match(int player1Hand, int player2Hand) {
        this.player1 = new Player(player1Hand);
        this.player2 = new Player(player2Hand);
        Analyse();
    }

    private void Analyse(){
        _result = getWinner(player1, player2);

        System.out.println("JO KEN PO!!!");
        System.out.println(_result);
    }

    private String getWinner(Player player1, Player player2) {
        if ((player1.Hand() + 1) % 3 == player2.Hand()) {
            return MessageFormat.format(
                    "{0} beats {1}: Player 2 won.",
                    player2.HandName(),
                    player1.HandName()
            );
        }
        if ((player1.Hand() == player2.Hand())) {
            return MessageFormat.format(
                    "{0} equals {1}: It is a draw!",
                    player1.HandName(),
                    player2.HandName()
            );
        }
        return MessageFormat.format(
                    "{0} beats {1}: Player 1 won.",
                    player1.HandName(),
                    player2.HandName()
            );
    }

    public String result() {
        return _result;
    }
}
