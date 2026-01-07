//Write a Java program to create Player class. Derive Cricket_Player and 
//Football_Player classes from Player class. Define proper constructor for all the 
//classes. Also define Display_Info method in all the three classes to display 
//details of the players.


import java.io.*;

class Player{
    String name;
    int age;
    int scores;
    
    Player(String name,int age, int scores){
        this.name = name;
        this.age = age;
        this.scores = scores;
    }
    
    
   public void player_details(){
       System.out.println("Player Details: ");
       System.out.println("Name of the Player: "+name);
       System.out.println("Age of the player: "+age);
       System.out.println("Scores of the Player: "+scores);
   }
}

//Creating Cricket Player 
class CricketPlayer extends Player{
    int centuries;
    
    CricketPlayer(String name,int age,int scores,int centuries){
        super(name,age,scores);
        this.centuries = centuries;
    }
    
    @Override 
    public void player_details(){
        System.out.println("Cricket Player Details: ");
        System.out.println("Name: "+super.name);
        System.out.println("Age: "+super.age);
        System.out.println("Runs: "+super.scores);
        System.out.println("Centuries: "+this.centuries);
        
    }
}

//Creating the Football Player Class 
class FootballPlayer extends Player{
    int wins;
    
    FootballPlayer(String name,int age,int scores,int wins){
        super(name,age,scores);
        this.wins = wins;
    }
    
    @Override 
    public void player_details(){
        System.out.println("Football Player Details: ");
        System.out.println("Name: "+super.name);
        System.out.println("Age: "+super.age);
        System.out.println("Goals: "+super.scores);
        System.out.println("Wins: "+this.wins);
        
    }
}

//main driver class 

public class Main{
    public static void main(String[]args){
        Player p = new Player("Virat",41,15000);
        CricketPlayer cp = new CricketPlayer("Dhoni",51,18000,120);
        FootballPlayer fp = new FootballPlayer("Ronaldo",42,3200,330);
        
        p.player_details();
        cp.player_details();
        fp.player_details();
    }
}

