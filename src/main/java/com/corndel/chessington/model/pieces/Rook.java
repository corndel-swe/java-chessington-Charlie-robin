package com.corndel.chessington.model.pieces;

import com.corndel.chessington.model.Board;
import com.corndel.chessington.model.Coordinates;
import com.corndel.chessington.model.Move;
import com.corndel.chessington.model.PlayerColour;

import java.util.ArrayList;
import java.util.List;

public class Rook extends AbstractPiece {

    public Rook(PlayerColour colour) {
        super(PieceType.ROOK, colour, new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}});
    }

}
