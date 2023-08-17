package Homework2.State;

import Homework2.State.States.*;
import Homework2.State.Players.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(72125);

        PlayingState playingState = new PlayingState(player);
        PausedState pausedState = new PausedState(player);
        StopState stopState = new StopState(player);

        player.getFormattedTime();

        player.setCurrentState(playingState);
        player.getStateInfo();
        player.doAction();

        player.setCurrentState(pausedState);
        player.getStateInfo();
        player.doAction();

        player.setCurrentState(stopState);
        player.getStateInfo();
        player.doAction();

        player.setCurrentState(playingState);
        player.doAction();
        player.doAction();
    }
}
