package Homework2.State.Players;

import Homework2.State.States.State;

public class Player {
    private State currentState;
    public int currentTimeMs;

    public Player(State state, int timeMs) {
        currentState = state;
        currentTimeMs = timeMs;
    }

    public Player(State state) {
        this(state, 0);
    }

    public Player(int timeMs) {
        this(null, timeMs);
    }

    public Player() {
        this(null, 0);
    }

    public void doAction() {
        if(currentState != null) {
            currentState.doAction();
        }
    }

    public void getStateInfo() {
        if(currentState != null) {
            currentState.getStateInfo();
        }
    }

    public void setCurrentState(State state) {
        currentState = state;
        state.doAction();
    }

    public void getFormattedTime() {
        System.out.println("Current time - " + currentTimeMs / 60000 + " m "
                + currentTimeMs % 60000 / 1000 + "." + currentTimeMs % 1000 + " s");
    }
}
