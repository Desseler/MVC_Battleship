package com.desseler.battleship.model

import java.util.Random;

public class BattleshipModel {
  private int[][] p1PieceBoard;
  private int[][] p2PieceBoard;
  private int[][] p1HitBoard;
  private int[][] p2HitBoard;
  private int turn;

  private static final int NORTH = 0;
  private static final int EAST = 1;
  private static final int SOUTH = 2;
  private static final int WEST = 3;

  private static final int CARRIER = 5;
  private static final int BATTLESHIP = 4;
  private static final int CRUISER = 3;
  private static final int DESTROYER = 2;
  private static final int SUBMARINE = 1;
  private static final int EMPTY = 0;

  public BattleshipModel() {
    turn = 0;
    p1PieceBoard = new int[10][10];
    p2PieceBoard = new int[10][10];
    p1HitBoard = new int[10][10];
    p2HitBoard = new int[10][10];
    
    initRandomBoard(p1PieceBoard);
    initRandomBoard(p2PieceBoard);
  }

  public BattleshipModel(int row, int col) {
    turn = 0;
    p1PieceBoard = new int[row][col];
    p2PieceBoard = new int[row][col];
    p1HitBoard = new int[row][col];
    p2HitBoard = new int[row][col];
    
    initRandomBoard(p1PieceBoard);
    initRandomBoard(p2PieceBoard);
  }

  public BattleshipModel(int[][] p1Board, int[][] p2Board) {
    turn = 0;
    p1PieceBoard = p1Board;
    p2PieceBoard = p2Board;
    p1HitBoard = new int[p1Board.length][p1Board[0].length];
    p2HitBoard = new int[p2Board.length][p2Board[0].length];
  }

  public int[][] getPieceBoard(int player) {
    if(player == 1) {
      return p1PieceBoard;
    } else if(player == 2) {
      return p2PieceBoard;
    } else {
      return null;
    }
  }

  public int[][] getHitBoard(int player) {
    if(player == 1) {
      return p1HitBoard;
    } else if(player == 2) {
      return p2HitBoard;
    } else {
      return null;
    }
  }

  public getTurn() {
    return turn;
  }

  private void randomBoard(int[][] board) {
    
  }

  /**
   * Adds a given piece to a board. Checks to see if the piece will fit.
   * If it doesn't, then returns -1 and doesn't modify the board.
   *
   * @return -1 if failure, else 0
   */
  private int addPiece(int piece, int direction, int[][] board) {

  }
}
