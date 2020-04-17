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
            System.out.println(luku2);
            System.out.println("Computer chose: " + luku2);

            if (luku1 == luku2){
                System.out.println("Tasapeli!");
            }else if (luku1==1 && luku2==2){
                System.out.println("Pelaaja 2 voitti!");
                computer++;
            }else if (luku1==2 && luku2==3){
                System.out.println("Pelaaja 2 voitti!");
                computer++;
            }else if (luku1==3 && luku2==1){
                System.out.println("Pelaaja 2 voitti!");
                computer++;
            }else if (luku2==1 && luku1==2){
                System.out.println("Pelaaja 1 voitti!");
                human++;
            }else if (luku2==2 && luku1==3){
                System.out.println("Pelaaja 1 voitti!");
                human++;
            }else if (luku2==3 && luku1==1){
                System.out.println("Pelaaja 1 voitti!");
                human++;
            }
            i++;
        }while (i<3);

        if(human>computer){
            System.out.println("Pelaaja voitti koko matsin!");
        }else if(human<computer){
            System.out.println("Tietokone voitti koko matsin!");
        }else if(human == computer){
            System.out.println("Tasapeli!");
        }
    }
}