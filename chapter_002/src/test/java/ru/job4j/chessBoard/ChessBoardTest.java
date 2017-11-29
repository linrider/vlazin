package ru.job4j.chessBoard;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ChessBoardTest {
    @Test
    public void WhenBishopMoveOnFreeBoard() throws OccupiedWayException {
        Board chessBoard = new Board();
        Cell source = new Cell(2, 1);
        Bishop whiteBishop = new Bishop(true, source);
        chessBoard.addFigure(whiteBishop);
        Cell dest = new Cell(4, 3);
        boolean result = chessBoard.move (source, dest);
        assertThat(result, is(true));

    }

}