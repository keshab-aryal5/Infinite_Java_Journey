package assignment;
import java.util.Scanner;
public class RockPaperScissor {
    static char ComputerChoice(){
        int num = ((int)(Math.random()*100)%3)+1;
        if(num == 1)
            return 'S';
        else if(num==2)
            return 'P';
        else
            return 'R';
    }
    static char UserChoice(){
        Scanner in = new Scanner(System.in);
        char choice;
        System.out.print("Enter Scissor, Paper or Rock? ");
        choice = in.next().toUpperCase().charAt(0);
        return choice;
    }
    public static void main(String[] args) {
        char comp,user;
        do{
            comp = ComputerChoice();
            user = UserChoice();
            if(user==comp){
                System.out.println("Your choice: "+user);
                System.out.println("Computer choice: "+comp);
                System.out.println("Draw");
            }
            else if(comp=='S'){
                if(user=='P'){
                    System.out.println("Your choice: "+user);
                    System.out.println("Computer choice: "+comp);
                    System.out.println("You loose");
                }
                else if(user=='R'){
                    System.out.println("Your choice: "+user);
                    System.out.println("Computer choice: "+comp);
                    System.out.println("You won");
                }
            }
            else if(comp =='P'){
                if(user=='S'){
                    System.out.println("Your choice: "+user);
                    System.out.println("Computer choice: "+comp);
                    System.out.println("You Won");
                }
                else if(user=='R'){
                    System.out.println("Your choice: "+user);
                    System.out.println("Computer choice: "+comp);
                    System.out.println("You Loose");
                }
            }
            else if(comp=='R'){
                if(user=='S'){
                    System.out.println("Your choice: "+user);
                    System.out.println("Computer choice: "+comp);
                    System.out.println("You loose");
                }
                else if(user=='P'){
                    System.out.println("Your choice: "+user);
                    System.out.println("Computer choice: "+comp);
                    System.out.println("You Won");
                }
            }
            else
                user = 'X';

        }while(user!='X');
    }
}
