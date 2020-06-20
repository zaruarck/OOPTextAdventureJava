package com.company;

public class Character {
    private String name;
    private int hitPoints;
    private String role;

    public Character(String name,int hitPoints,String role)
    {
        this.name = name;
        this.hitPoints = hitPoints;
        this.role = role;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }
    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }
    public void setRole(String role)
    {
        this.role = role;
    }
    public String getRole()
    {
        return role;
    }


}
