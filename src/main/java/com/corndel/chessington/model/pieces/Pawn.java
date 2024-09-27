package com.corndel.chessington.model.pieces;

import com.corndel.chessington.model.Board;
import com.corndel.chessington.model.Coordinates;
import com.corndel.chessington.model.Move;
import com.corndel.chessington.model.PlayerColour;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Pawn extends AbstractPiece {

    private final int direction;

    public Pawn(PlayerColour colour) {
        super(PieceType.PAWN, colour, true);
        this.direction = colour.equals(PlayerColour.WHITE) ? -1 : 1;
    }

    @Override
    public List<Move> getAllowedMoves(Coordinates from, Board board) {

        Coordinates next = from.plus(direction, 0);

        List<Move> allowedMoves = new ArrayList<>(getDiagonalMoves(from, board, next));

        if (board.isCoordinateOffBoard(next) || board.get(next) != null) {
            return allowedMoves;
        }

        allowedMoves.addAll(super.getAllowedMoves(from, board));

        if (from.getRow() == 6 || from.getRow() == 1) {
            allowedMoves.add(new Move(from, from.plus(direction * 2, 0)));
        }

        return allowedMoves;
    }

    private List<Move> getDiagonalMoves(Coordinates from, Board board, Coordinates next) {
        return Stream.of(next.plus(0, 1), next.plus(0, -1))
                .filter(c -> !board.isCoordinateOffBoard(c) && board.canTake(c, colour))
                .map(c -> new Move(from, c))
                .toList();
    }

    @Override
    public int[][] getDirections() {
        return new int[][]{{direction, 0}};
    }
}
