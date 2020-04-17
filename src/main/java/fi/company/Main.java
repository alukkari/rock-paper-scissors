package fi.company;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);

        int human = 0;
        int computer = 0;

        int i=0;
        do{
            System.out.println("Choose your weapon:");
            System.out.println("(1)-Rock (2)-Paper (3)-Scissors ?");
            int luku1 = Integer.parseInt(s.nextLine());
            int luku2 = (int) (Math.random() * 3)+1;

            if (luku1 == 1){
                System.out.println("You chose Rock");
            }else if (luku1 == 2){
                System.out.println("You chose Paper");
            }else if (luku1==3){
                System.out.println("You chose Scissors");
            }

            if (luku2 == 1){
                System.out.println("Computer chose Rock");
            }else if (luku2 == 2){
                System.out.println("Computer chose Paper");
            }else if (luku2==3){
                System.out.println("Computer chose Scissors");
            }

            if (luku1 == luku2){
                System.out.println("Tie!");
            }else if (luku1==1 && luku2==2){
                System.out.println("Computer Won!");
                computer++;
            }else if (luku1==2 && luku2==3){
                System.out.println("Computer Won!");
                computer++;
            }else if (luku1==3 && luku2==1){
                System.out.println("Computer Won!");
                computer++;
            }else if (luku2==1 && luku1==2){
                System.out.println("You Won!");
                human++;
            }else if (luku2==2 && luku1==3){
                System.out.println("You Won!");
                human++;
            }else if (luku2==3 && luku1==1){
                System.out.println("You Won!");
                human++;
            }
            i++;
        }while (i<3);

        if(human>computer){
            System.out.println("You Won the match!");
        }else if(human<computer){
            System.out.println("Computer Won the match!");
        }else if(human == computer){
            System.out.println("Match is a Tie");
        }
    }
}