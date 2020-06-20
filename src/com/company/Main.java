package com.company;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private final Map<Integer, Map<Integer,Room>> map = new HashMap<Integer, Map<Integer, Room>>();
    int[][] nums  = {{1,2}};
    Room[][] arrayMap = new Room[1][1];
    Room[][] arrayMapRedux = {{Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile()},
                              {Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile()},
                              {Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile()},
                              {Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile()},
                              {Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile(),Room.newBattleTile()}
                            };
    Scanner inputScanner = new Scanner(System.in);




    public void play()
     {

         System.out.println("Hello World");
         Player player = new Player("test",20,"Test");
         String name = player.getName();
         System.out.println("Players Name " + player.getName());
         Monster monster = new Monster(null,0,null);
         map.put(0,new HashMap<Integer, Room>());
         while(player.getHitPoints() > 0)
         {
             makeMove(player);

         }
         if (player.getHitPoints() <= 0)
         {
             System.out.println("You lose");
         }





         //System.out.println(map.get(0).get(0));








     }

     public void makeMove(Player player)
     {

         checkPosition(player);
         String direction = inputScanner.nextLine();

         if(direction.equalsIgnoreCase("South") && player.getmoveDown())
         {
             player.incrementCurrentY();
             System.out.println("Player Current Y " + player.getCurrentY());
             System.out.println("Player Current X " + player.getCurrentX());
         }
         else if(direction.equalsIgnoreCase("North") && player.getMoveUp())
         {
             player.decrementCurrentY();

             System.out.println("Player Current Y " + player.getCurrentY());
             System.out.println("Player Current X " + player.getCurrentX());
         }
         else if(direction.equalsIgnoreCase("West") && player.getMoveLeft())
         {
             player.decrementCurrentX();
             System.out.println("Player Current Y " + player.getCurrentY());
             System.out.println("Player Current X " + player.getCurrentX());
         }
         else if(direction.equalsIgnoreCase("East") && player.getMoveRight() == true)
         {
             player.incrementCurrentX();
             System.out.println("Player Current Y " + player.getCurrentY());
             System.out.println("Player Current X " + player.getCurrentX());
         }
         else
             {
             System.out.println("You cannot go that way");
         }
         System.out.println(arrayMapRedux[player.getCurrentY()][player.getCurrentX()].returnDescription());







         System.out.println(arrayMapRedux.length);
         return;
     }



    public void checkPosition(Player player)
     {
         if(player.getCurrentY() + 1 <= arrayMapRedux.length)
         {
             player.setMoveDown(true);
             System.out.println("South");
         }
         else
         {
             player.setMoveDown(false);
         }
         if(player.getCurrentY() - 1 >= 0)
         {
             player.setMoveUp(true);
             System.out.println("North");
         }
         else
         {
             player.setMoveUp(false);
         }
         if(player.getCurrentX() + 1 <= arrayMapRedux[player.getCurrentY()].length)
         {
             player.setMoveRight(true);
             System.out.println("East");
         }
         else
         {
             player.setMoveRight(false);
         }
         if(player.getCurrentX()  - 1 >= 0)
         {
             player.setMoveLeft(true);
             System.out.println("West");
         }
         else
         {
             player.setMoveLeft(false);
         }
         return;

     }

    public static void main(String[] args)
    {
	Main main = new Main();
	main.play();
    }
}
