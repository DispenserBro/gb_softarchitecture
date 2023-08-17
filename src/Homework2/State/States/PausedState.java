package Homework2.State.States;

import Homework2.State.Players.Player;

public class PausedState extends State {
    boolean isPaused;

    public PausedState(Player player) {
        super(player);
        isPaused = false;
    }

    @Override
    public void doAction() {
        if (isPaused) {
            System.out.println("Resuming...");
            // Тут можно было сделать переход на другое состояние, но нет
            player.setCurrentState(new PlayingState(player));
        }
        else {
            System.out.println("Pausing...");
        }
        isPaused = !isPaused;
    }

    @Override
    public void getStateInfo() {
        System.out.println("Audio paused");
    }
}
