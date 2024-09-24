package com.corndel.chessington.model.pieces;

import com.corndel.chessington.model.PlayerColour;

public class Rook extends AbstractPiece {

    public Rook(PlayerColour colour) {
        super(PieceType.ROOK, colour, new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}});
    }

}
