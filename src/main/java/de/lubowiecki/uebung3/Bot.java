package de.lubowiecki.uebung3;

public class Bot {

    private int xPos;

    private int yPos;

    private Board board;

    public Bot(int xPos, int yPos, Board board) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.board = board;
    }

    public Bot(Board board) {
        this.board = board;
    }

    private boolean move() {
        return board.setBot(xPos, yPos);
    }

    public boolean move(Direction direction) {

        switch (direction) {
            case TOP: xPos--;
            break;

            case DOWN: xPos++;
            break;

            case LEFT: yPos--;
            break;

            case RIGHT: yPos++;
            break;
        }

        return move();
    }
}
