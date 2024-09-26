package com.corndel.chessington.model.pieces;

import com.corndel.chessington.model.Board;
import com.corndel.chessington.model.Coordinates;
import com.corndel.chessington.model.Move;
import com.corndel.chessington.model.PlayerColour;

import java.util.List;

public class King extends AbstractPiece {

    public King(PlayerColour colour) {
        super(PieceType.KING, colour, true);
    }

    @Override
    public int[][] getDirections() {
        return new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
        };
    }
}
