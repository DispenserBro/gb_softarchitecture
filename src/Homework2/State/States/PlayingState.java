package Homework2.State.States;

import Homework2.State.Players.Player;

public class PlayingState extends State {
    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public void doAction() {
        player.currentTimeMs += 100;
        System.out.println("Playing...");
        player.getFormattedTime();
    }

    @Override
    public void getStateInfo() {
        System.out.println("Player plays audio");
    }
}
