package Homework2.State.States;

import Homework2.State.Players.Player;

public abstract class State {
    Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract void doAction();
    public abstract void getStateInfo();
}
