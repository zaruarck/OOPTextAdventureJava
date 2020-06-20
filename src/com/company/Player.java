package com.company;

public class Player  extends Character
{
    private int currentX = 2;
    private int currentY = 2;
    private boolean moveDown = false;
    private boolean moveUp = false;
    private boolean moveLeft = false;
    private boolean moveRight = false;

    public Player(String name,int hitPoints,String role)
    {
        super(name,hitPoints,role);

    }



    public int getCurrentX()
    {
        return currentX;
    }
    public int getCurrentY()
    {
        return currentY;
    }
    public void setMoveDown(boolean moveDown)
    {
        this.moveDown = moveDown;
    }
    public boolean getmoveDown()
    {
        return moveDown;
    }
    public void setMoveUp(boolean moveUp)
    {
        this.moveUp = moveUp;
    }
    public boolean getMoveUp()
    {
        return moveUp;
    }
    public void setMoveLeft(boolean moveLeft)
    {
        this.moveLeft = moveLeft;
    }
    public boolean getMoveLeft()
    {
        return moveLeft;
    }
    public void setMoveRight(boolean moveRight)
    {
        this.moveRight = moveRight;
    }
    public boolean getMoveRight()
    {
        return moveRight;
    }

    public void incrementCurrentY()
    {
        currentY++;
    }
    public void decrementCurrentY()
    {
        currentY--;
    }
    public void incrementCurrentX()
    {
        currentX++;
    }
    public void decrementCurrentX()
    {
        currentX--;
    }


}
