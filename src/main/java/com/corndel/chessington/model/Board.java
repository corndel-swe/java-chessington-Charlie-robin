package com.corndel.chessington.model;

import com.corndel.chessington.model.pieces.*;

public class Board {

    public static final int BOARD_SIZE = 8;

    private Piece[][] board = new Piece[BOARD_SIZE][BOARD_SIZE];

    private Board() {
    }

    public static Board forNewGame() {
        Board board = new Board();
        board.setBackRow(0, PlayerColour.BLACK);
        board.setBackRow(7, PlayerColour.WHITE);

        for (int col = 0; col < BOARD_SIZE; col++) {
            board.board[1][col] = new Pawn(PlayerColour.BLACK);
            board.board[6][col] = new Pawn(PlayerColour.WHITE);
        }

        return board;
    }

    public Piece[][] getBoard() {
        return board;
    }

    public static Board empty() {
        return new Board();
    }

    private void setBackRow(int rowIndex, PlayerColour colour) {
        board[rowIndex][0] = new Rook(colour);
        board[rowIndex][1] = new Knight(colour);
        board[rowIndex][2] = new Bishop(colour);
        board[rowIndex][3] = new Queen(colour);
        board[rowIndex][4] = new King(colour);
        board[rowIndex][5] = new Bishop(colour);
        board[rowIndex][6] = new Knight(colour);
        board[rowIndex][7] = new Rook(colour);
    }

    public Piece get(Coordinates coords) {
        return board[coords.getRow()][coords.getCol()];
    }

    public void move(Coordinates from, Coordinates to) {
        Piece piece = board[from.getRow()][from.getCol()];
        board[to.getRow()][to.getCol()] = piece;
        board[from.getRow()][from.getCol()] = null;
    }

    public void placePiece(Coordinates coords, Piece piece) {
        board[coords.getRow()][coords.getCol()] = piece;
    }

    public boolean isCoordinateOffBoard(Coordinates coordinates) {
        return coordinates.getCol() >= Board.BOARD_SIZE
                || coordinates.getCol() < 0
                || coordinates.getRow() >= Board.BOARD_SIZE
                || coordinates.getRow() < 0;
    }

    public boolean canTake(Coordinates coordinates, PlayerColour colour) {
        return get(coordinates) != null && get(coordinates).getColour() != colour;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for(Piece[] pieces : board){

            for(Piece piece : pieces){
                builder.append(piece);
            }
            builder.append("\n");
        }

        return "Board{" +
                "board=" + builder +
                '}';
    }
}
