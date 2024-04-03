package com.example.snakeandladder;

import javafx.util.Pair;

import java.util.ArrayList;

public class Board {
    ArrayList<Pair<Integer, Integer>> positionCoordinates;
    ArrayList<Integer> snakeLadder;

    public Board(){
        positionCoordinates = new ArrayList<>();
        setPositionCoordinates();
        setSnakeLadder();

    }

    private void setSnakeLadder(){
        snakeLadder = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            snakeLadder.add(i);
        }
        snakeLadder.set(2,23);
        snakeLadder.set(4,68);
        snakeLadder.set(6,45);
        snakeLadder.set(20,59);
        snakeLadder.set(30,96);
        snakeLadder.set(43,17);
        snakeLadder.set(50,5);
        snakeLadder.set(52,72);
        snakeLadder.set(56,8);
        snakeLadder.set(57,96);
        snakeLadder.set(71,92);
        snakeLadder.set(73,15);
        snakeLadder.set(84,58);
        snakeLadder.set(87,49);
        snakeLadder.set(98,40);
    }

    public  Integer getNewPosition(int currentPosition){
        if(currentPosition>0 && currentPosition<=100){
            return snakeLadder.get(currentPosition);
        }
        return -1;
    }
    private void setPositionCoordinates(){
        positionCoordinates.add(new Pair<>(0,0)); //dummy value
        for (int i = 0; i < SnakeLadder.height; i++) {
            for (int j = 0; j < SnakeLadder.width; j++) {
                //x coordinates
                int xCord = 0;
                if(i%2==0){
                 xCord = j*SnakeLadder.tileSize + SnakeLadder.tileSize/2;
                }
                else{
                 xCord = SnakeLadder.tileSize*SnakeLadder.width - (j*SnakeLadder.tileSize) - SnakeLadder.tileSize/2;
                }
                //y coordinates
                int yCord = SnakeLadder.tileSize*SnakeLadder.height - (i*SnakeLadder.tileSize) - SnakeLadder.tileSize/2;
                positionCoordinates.add(new Pair<>(xCord,yCord));
            }
        }
    }
    int getXCoordinate(int position){
        if(position>=1 && position<=100){
            return positionCoordinates.get(position).getKey();
        }
        return -1;
    }

    int getYCoordinate(int position){
        if(position>=1 && position<=100){
            return positionCoordinates.get(position).getValue();
        }
        return -1;
    }

//    public static void main(String[] args) {
//        Board board = new Board();
//        for (int i = 0; i < board.positionCoordinates.size(); i++) {
//            System.out.println(i + "$ x : "+board.positionCoordinates.get(i).getKey()+" y : "+board.positionCoordinates.get(i).getValue());
//        }
//    }

}
