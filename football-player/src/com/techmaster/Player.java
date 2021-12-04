package com.techmaster;

public class Player {
    private int number;
    private String fullName;
    private Position position;

    public Player(int number, String fullName, Position position) {
        this.number = number;
        this.fullName = fullName;
        this.position = position;
    }

    public Player() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    public int getIndexOf(int n)
    {
        return this.getIndexOf(n);
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", fullName='" + fullName + '\'' +
                ", position=" + position +
                '}';
    }
}
