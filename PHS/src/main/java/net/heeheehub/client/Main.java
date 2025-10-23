package net.heeheehub.client;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String[] item = {"Hammer" , "Scissors" , "Paper"};
//        Random aiRandom = new Random();
//
//        for (String s : item) {
//            System.out.println(s);
//        }
//
//        int playerChose = scanner.nextInt();
////        int playerChoseInt = Integer.parseInt(playerChose);
//        int aiPlay = aiRandom.nextInt(3);
//
//        System.out.println(playerChose + " " + item[playerChose]);
//        System.out.println(aiPlay + " " + item[aiPlay]);
//
//        if (playerChose == aiPlay){
//            System.out.println("draw");
//        }
//        else if(playerChose == 0 && aiPlay == 1){
//            System.out.println("Player Win");
//        }
//        else if(playerChose == 1 && aiPlay == 2){
//            System.out.println("Player Win");
//        }
//        else if(playerChose == 2 && aiPlay == 0){
//            System.out.println("Player Win");
//        }
//        else {
//            System.out.println("Ai win");
//        }
//
//

        Player player = new Player(3);
        Ai ai = new Ai();
        Game game = new Game();
        System.out.println("Player Heath " + player.getPlayerHeath());
       while (player.PlayerHeath != 0) {
           int playerChose = player.chose();
           int aiChose = ai.randomAi();
           game.Judg(playerChose, aiChose, player);
       }
       System.out.println("You lose");
    }
}