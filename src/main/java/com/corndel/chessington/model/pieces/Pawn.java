package com.corndel.chessington.model.pieces;

import com.corndel.chessington.model.Board;
import com.corndel.chessington.model.Coordinates;
import com.corndel.chessington.model.Move;
import com.corndel.chessington.model.PlayerColour;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Pawn implements Piece {

    private final Piece.PieceType type;
    protected final PlayerColour colour;

    public Pawn(PlayerColour colour) {
        this.type = PieceType.PAWN;
        this.colour = colour;
    }

    @Override
    public Piece.PieceType getType() {
        return type;
    }

    @Override
    public PlayerColour getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return colour.toString() + " " + type.toString();
    }

    @Override
    public List<Move> getAllowedMoves(Coordinates from, Board board) {
        List<Move> allowedMoves = new ArrayList<Move>();

        int direction = colour.equals(PlayerColour.WHITE) ? -1 : 1;

        Coordinates next = from.plus(direction, 0);

        Stream.of(next.plus(0, 1), next.plus(0, -1))
                .filter(c -> board.onBoard(c) && board.canTake(c, colour))
                .forEach(c -> allowedMoves.add(new Move(from, c)));

        if (!board.onBoard(next) || board.get(next) != null) {
            return allowedMoves;
        }

        allowedMoves.add(new Move(from, next));

        if (from.getRow() == 6 || from.getRow() == 1) {
            allowedMoves.add(new Move(from, from.plus(direction * 2, 0)));
        }

        return allowedMoves;
    }
}
