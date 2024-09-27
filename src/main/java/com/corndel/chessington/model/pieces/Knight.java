package com.corndel.chessington.model.pieces;

import com.corndel.chessington.model.Board;
import com.corndel.chessington.model.Coordinates;
import com.corndel.chessington.model.Move;
import com.corndel.chessington.model.PlayerColour;

import java.util.ArrayList;
import java.util.List;

public class Knight extends AbstractPiece {

    public Knight(PlayerColour colour) {
        super(PieceType.KNIGHT, colour, true);
    }

    @Override
    public int[][] getDirections() {
        return new int[][]{{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};
    }

    public void test(){

    }

    public static void main(String[] args) {
        Piece piece = new Knight(PlayerColour.WHITE);

        AbstractPiece abstractKnight = new Knight(PlayerColour.WHITE);
        AbstractPiece abstractPawn = new Pawn(PlayerColour.WHITE);

        List<AbstractPiece> pieces = new ArrayList<>();
        pieces.add(abstractKnight);
        pieces.add(abstractPawn);

        System.out.println(abstractKnight.getAllowedMoves(new Coordinates(0, 1), Board.forNewGame()));

        System.out.println("-".repeat(10));

        System.out.println(abstractPawn.getAllowedMoves(new Coordinates(0, 1), Board.forNewGame()));


        Knight knight = new Knight(PlayerColour.WHITE);
    }
}
