package net.heeheehub.client;

import java.util.Objects;
import java.util.Scanner;

public class Player {

    int PlayerHeath;

    public Player(int PlayerHeath){
        this.PlayerHeath = PlayerHeath;
    }

    public int getPlayerHeath() {
        return PlayerHeath;
    }

    public void setPlayerHeath(int playerHeath) {
        PlayerHeath = playerHeath;
    }

    public int chose(){
        Scanner scanner = new Scanner(System.in);
            while (true){
                String playerChosenum = scanner.nextLine();
                if (Objects.equals(playerChosenum, "1") || Objects.equals(playerChosenum, "2") || Objects.equals(playerChosenum, "3")){
                    return Integer.parseInt(playerChosenum) - 1;
                }
                System.out.println("Only number 1 , 2 , 3");
            }

    }



}
