package it.business.jj.tictactoe.service;

import it.business.jj.tictactoe.entitiy.Point;

import java.util.HashMap;
import java.util.Random;

public class TicTacToeService {
    private final Point POINT00 = new Point(0,0);
    private final Point POINT01 = new Point(0,1);
    private final Point POINT02 = new Point(0,2);
    private final Point POINT10 = new Point(1,0);
    private final Point POINT11 = new Point(1,1);
    private final Point POINT12 = new Point(1,2);
    private final Point POINT20 = new Point(2,0);
    private final Point POINT21 = new Point(2,1);
    private final Point POINT22 = new Point(2,2);
    private static HashMap<Point, Integer> board = new HashMap<>();
    Random random = new Random();

    public TicTacToeService() {
        board.put(POINT00,1);
        board.put(POINT01,1);
        board.put(POINT02,1);
        board.put(POINT10,1);
        board.put(POINT11,1);
        board.put(POINT12,1);
        board.put(POINT20,1);
        board.put(POINT21,1);
        board.put(POINT22,1);
    }

    public boolean isFull() {
        return board.isEmpty();
    }

    public boolean isWin(HashMap<Point, Integer> player){
        if(player.size() >= 3){
            if(
                    (player.containsKey(POINT00) && player.containsKey(POINT01) && player.containsKey(POINT02)) ||
                    (player.containsKey(POINT10) && player.containsKey(POINT11) && player.containsKey(POINT12)) ||
                    (player.containsKey(POINT20) && player.containsKey(POINT21) && player.containsKey(POINT22)) ||
                    (player.containsKey(POINT00) && player.containsKey(POINT10) && player.containsKey(POINT20)) ||
                    (player.containsKey(POINT01) && player.containsKey(POINT11) && player.containsKey(POINT21)) ||
                    (player.containsKey(POINT01) && player.containsKey(POINT12) && player.containsKey(POINT22)) ||
                    (player.containsKey(POINT00) && player.containsKey(POINT11) && player.containsKey(POINT22)) ||
                    (player.containsKey(POINT02) && player.containsKey(POINT11) && player.containsKey(POINT20))
            )
                return true;
        }
        return false;
    }

    public boolean game(int x, int y, HashMap<Point, Integer> player){
        Point choice = new Point(x,y);
        if(board.containsKey(choice)){
            player.put(choice,1);
            board.remove(choice);
            return true;
        }
        else
            return false;

    }

    public Point computerGameEasy(){
        return computerStartHelper();
    }
    
 
    private Point computerStartHelper(){
        Object[] keys = board.keySet().toArray();
        Point key = (Point) keys[random.nextInt(keys.length)];
        return key;
    }
    
}
