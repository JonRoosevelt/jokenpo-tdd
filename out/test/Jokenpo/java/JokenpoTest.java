package main.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JokenpoTest {
    @Test
    void testPaperWinsOverRock() {
        var match = new Match(HandEnum.ROCK.getValue(), HandEnum.PAPER.getValue());
        var result = match.result();
        Assertions.assertEquals("PAPER beats ROCK: Player 2 won.", result);
    }

    @Test
    void testPaperWinsOverRockOppositeOrder() {
        var match = new Match(HandEnum.PAPER.getValue(), HandEnum.ROCK.getValue());
        var result = match.result();
        Assertions.assertEquals("PAPER beats ROCK: Player 1 won.", result);
    }

    @Test
    void testScissorsWinsOverPaper() {
        var match = new Match(HandEnum.SCISSORS.getValue(), HandEnum.PAPER.getValue());
        var result = match.result();
        Assertions.assertEquals("SCISSORS beats PAPER: Player 1 won.", result);
    }

    @Test
    void testScissorsWinsOverPaperOppositeOrder() {
        var match = new Match(HandEnum.PAPER.getValue(), HandEnum.SCISSORS.getValue());
        var result = match.result();
        Assertions.assertEquals("SCISSORS beats PAPER: Player 2 won.", result);
    }

    @Test
    void testRocksWinsOverScissors() {
        var match = new Match(HandEnum.SCISSORS.getValue(), HandEnum.ROCK.getValue());
        var result = match.result();
        Assertions.assertEquals("ROCK beats SCISSORS: Player 2 won.", result);
    }

    @Test
    void testRocksWinsOverScissorsOppositeOrder() {
        var match = new Match(HandEnum.ROCK.getValue(), HandEnum.SCISSORS.getValue());
        var result = match.result();
        Assertions.assertEquals("ROCK beats SCISSORS: Player 1 won.", result);
    }

    @Test
    void testEqualsHandsIsADraw() {
        var match1 = new Match(HandEnum.PAPER.getValue(), HandEnum.PAPER.getValue());
        var result1 = match1.result();

        var match2 = new Match(HandEnum.ROCK.getValue(), HandEnum.ROCK.getValue());
        var result2 = match2.result();

        Assertions.assertEquals("PAPER equals PAPER: It is a draw!", result1);
        Assertions.assertEquals("ROCK equals ROCK: It is a draw!", result2);
    }
}
