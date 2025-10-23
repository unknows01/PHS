package net.heeheehub.client;

public class Game {
    String[] item = {"Hammer" , "Scissors" , "Paper"};
    public Game(){
        int i = 0;
        for (String s : item) {
            i++;
            System.out.println(s + " = " + i);
        }
    }

    public void Judg(int playerChose , int aiPlay , Player player){

        System.out.println("Player :" + item[playerChose] );
        System.out.println("Ai :" + item[aiPlay] );
        if (playerChose == aiPlay){
            System.out.println("Heath left " + player.getPlayerHeath());
            System.out.println("draw");
        }
        else if(playerChose == 0 && aiPlay == 1){
            System.out.println("Heath left " + player.getPlayerHeath());
            System.out.println("Player Win");
        }
        else if(playerChose == 1 && aiPlay == 2){
            System.out.println("Heath left " + player.getPlayerHeath());
            System.out.println("Player Win");
        }
        else if(playerChose == 2 && aiPlay == 0){
            System.out.println("Heath left " + player.getPlayerHeath());
            System.out.println("Player Win");
        }
        else {

            player.setPlayerHeath(player.getPlayerHeath() - 1);
            System.out.println("Heath left " + player.getPlayerHeath());
            System.out.println("Ai win");
        }
    }



}
