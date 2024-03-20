package secondunit;

import java.util.Scanner;

class NoughtsAndCrossesGame {
  private Player player1;
  private Player player2;
  private Board board;
  private Scanner scanner;

  NoughtsAndCrossesGame() {
    board = new Board();
    scanner = new Scanner(System.in);
    play();
  }

  public void play() {
    initPlayers();
    board.initialize();
    board.printBoard();
    while (!doWeHaveAWinner()) {
      nextTurn();
      board.printBoard();
    }
    endGame();
  }

  private void initPlayers() {
    System.out.println("Player one name:");
    String name1 = scanner.nextLine();
    player1 = new Player(name1);
    player1.setSymbol("X");

    System.out.println("Player two name:");
    String name2 = scanner.nextLine();
    player2 = new Player(name2);
    player2.setSymbol("O");
  }

  private void nextTurn() {
    Player currentPlayer = player1.isTurn() ? player1 : player2;
    System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + ")");
    makeMove(currentPlayer);
    changeTurn();
  }

  private void makeMove(Player player) {
    int x, y;
    do {
      System.out.print("Enter row -> and column ^ (0-2): ");
      x = scanner.nextInt();
      y = scanner.nextInt();
    } while (!isValidMove(x, y));
    board.markPosition(x, y, player.getSymbol());
  }

  private boolean isValidMove(int x, int y) {
    return x >= 0 && x < 3 && y >= 0 && y < 3 && board.isEmpty(x, y);
  }

  private void changeTurn() {
    player1.setTurn(!player1.isTurn());
    player2.setTurn(!player2.isTurn());
  }

  private boolean doWeHaveAWinner() {
    return board.checkForWinner(player1.getSymbol()) || board.checkForWinner(player2.getSymbol()) || board.isFull();
  }

  private void endGame() {
    if (board.checkForWinner(player1.getSymbol())) {
      System.out.println(player1.getName() + " wins! uwu");
    } else if (board.checkForWinner(player2.getSymbol())) {
      System.out.println(player2.getName() + " wins! owo");
    } else {
      System.out.println("how?");
    }
  }

  public static void main(String[] args) {
    new NoughtsAndCrossesGame();
  }
}

class Board {
  private String[][] board;
  private int numberOfMoves;

  Board() {
    board = new String[3][3];
    numberOfMoves = 0;
  }

  public void printBoard() {
    System.out.println("  0   1   2 ");
    for (int i = 0; i < 3; i++) {
      System.out.print(i + " ");
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] != null ? board[i][j] : " ");
        if (j < 2) {
          System.out.print(" | ");
        }
      }
      System.out.println();
      if (i < 2) {
        System.out.println("  —————————");
      }
    }
  }

  public boolean isEmpty(int x, int y) {
    return board[x][y] == null;
  }

  public void markPosition(int x, int y, String symbol) {
    board[x][y] = symbol;
    numberOfMoves++;
  }

  public boolean isFull() {
    return numberOfMoves == 9;
  }

  public boolean checkForWinner(String symbol) {
    for (int i = 0; i < 3; i++) {
      if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol)
        return true;
      if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)
        return true;
    }
    if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
      return true;
    if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
      return true;
    return false;
  }

  public void initialize() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = null;
      }
    }
    numberOfMoves = 0;
  }
}

class Player {
  private String name;
  private String symbol;
  private boolean turn;

  Player(String name) {
    this.name = name;
    this.turn = false;
  }

  public String getName() {
    return name;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public boolean isTurn() {
    return turn;
  }

  public void setTurn(boolean turn) {
    this.turn = turn;
  }
}
