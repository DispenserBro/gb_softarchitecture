package Homework2.State.States;

import Homework2.State.Players.Player;

public class StopState extends State {
    public StopState(Player player) {
        super(player);
    }

    @Override
    public void doAction() {
        if(player.currentTimeMs != 0) {
            System.out.println("Stopping...");
            player.currentTimeMs = 0;
        }
        else {
            getStateInfo();
        }
    }

    @Override
    public void getStateInfo() {
        System.out.println("Player stopped");
    }
}
