package com.Assignment;
import java.util.Random;
import java.util.Scanner;


class Game{
    private int target;
    private int userInput;
    private int numberOfGuesses;
    public Game()
    {
        Random rand = new Random();
        this.target = rand.nextInt(100)+1;
    }
    public void takeUserInput()
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Guess the number: ");
        this.userInput = sn.nextInt();
    }
    public boolean isCorrectNumber()
    {
        if(this.userInput>this.target)
        {
            System.out.println("You entered larger number");
            return false;
        }
        else if(this.userInput<this.target)
        {
            System.out.println("You entered lesser number");
            return false;
        }
        else
        {
            return true;
        }

    }
    public void setGuesses()
    {
        this.numberOfGuesses++;
    }
    public int getGuesses()
    {
        return this.numberOfGuesses;
    }
}
public class NumberGuess
{
    public static void main(String[] args) {
        Game g = new Game();
        do {
            g.takeUserInput();
            g.setGuesses();
        }while(!g.isCorrectNumber());
        System.out.printf("Yeah you got it correct in %d attempts",g.getGuesses());
    }
}
