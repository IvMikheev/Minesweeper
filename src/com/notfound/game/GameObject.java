package com.notfound.game;

class GameObject {
    private int x , y, countMineNeighbors;
    private boolean isMine, isOpen, isFlag;

    GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    int getCountMineNeighbors() {
        return countMineNeighbors;
    }

    void setCountMineNeighbors(int countMineNeighbors) {
        this.countMineNeighbors = countMineNeighbors;
    }

    boolean isMine() {
        return isMine;
    }

    void setMine() {
        isMine = true;
    }

    boolean isOpen() {
        return isOpen;
    }

    void setOpen() {
        isOpen = true;
    }

    boolean isFlag() {
        return isFlag;
    }

    void setFlag(boolean flag) {
        isFlag = flag;
    }
}
