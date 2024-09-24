package com.corndel.chessington.model.pieces;


import com.corndel.chessington.model.PlayerColour;

public class Bishop extends AbstractPiece {

    public Bishop(PlayerColour colour) {
        super(PieceType.BISHOP, colour, new int[][]{{-1, -1}, {1, 1}, {-1, 1}, {1, -1}});
    }

}
