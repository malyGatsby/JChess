package com.chess.engine;

import com.chess.engine.board.Board;

/**
 * Created by malyGatsby on 05.05.2021
 */

public class JChess {
    public static void main(String[] args) {
        Board board = Board.createStandardBoard();

        System.out.println(board);
    }
}
