package com.company;


import java.util.Random;

public class Room {
    private final String description;
    private static final int roomAmount = 3;
    private final Monster monster;


    private Room(String description, Monster monster)
    {
        this.description = description;

        this.monster = monster;
    }
    public static Room newBattleTile()
    {
        final Random random = new Random();
        int i = random.nextInt(roomAmount);
        String roomDescription;

        switch (i)
        {
            case 0:
                roomDescription = "Test1";
                break;
            case 1:
                roomDescription = "Test2";
                break;
            case 2:
                roomDescription = "Test3";
                break;
            case 3:
                roomDescription = "Test4";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }

        return new Room(roomDescription,null );
    }

    public String returnDescription()
    {
        return description;
    }


}
