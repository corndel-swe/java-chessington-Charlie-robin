package com.corndel.chessington.model.pieces;

import com.corndel.chessington.model.Board;
import com.corndel.chessington.model.Coordinates;
import com.corndel.chessington.model.Move;
import com.corndel.chessington.model.PlayerColour;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPiece implements Piece {

    private final Piece.PieceType type;
    protected final PlayerColour colour;
    private boolean moveOnce;

    protected AbstractPiece(Piece.PieceType type, PlayerColour colour) {
        this.type = type;
        this.colour = colour;
    }

    protected AbstractPiece(Piece.PieceType type, PlayerColour colour, boolean moveOnce) {
        this(type, colour);
        this.moveOnce = moveOnce;
    }

    public abstract int[][] getDirections();

    @Override
    public List<Move> getAllowedMoves(Coordinates from, Board board) {
        List<Move> allowedMoves = new ArrayList<>();

        for (int[] direction : getDirections()) {
            Coordinates current = from;

            while (true) {
                if (!current.equals(from) && moveOnce) break;

                current = current.plus(direction[0], direction[1]);

                if (board.isCoordinateOffBoard(current)) break;

                if (board.get(current) == null) {
                    allowedMoves.add(new Move(from, current));
                    continue;
                }

                if (board.canTake(current, colour)) {
                    allowedMoves.add(new Move(from, current));
                }

                break;
            }
        }

        return allowedMoves;
    }

    @Override
    public PieceType getType() {
        return type;
    }

    @Override
    public PlayerColour getColour() {
        return colour;
    }
}
