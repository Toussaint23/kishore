package it.business.jj.tictactoe.entitiy;

import java.util.HashMap;

public class Player {
    private String name;
    private int score;
    HashMap<Point, Integer> move;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.move = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public HashMap<Point, Integer> getMove() {
        return move;
    }

    public void clearAllMoves() {
        this.move = new HashMap<>();;
    }
}
