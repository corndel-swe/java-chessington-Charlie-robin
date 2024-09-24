package com.corndel.chessington.model.pieces;

import com.corndel.chessington.model.Board;
import com.corndel.chessington.model.Coordinates;
import com.corndel.chessington.model.Move;
import com.corndel.chessington.model.PlayerColour;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends AbstractPiece {

    public Bishop(PlayerColour colour) {
        super(PieceType.BISHOP, colour, new int[][]{{-1, -1}, {1, 1}, {-1, 1}, {1, -1}});
    }

}
