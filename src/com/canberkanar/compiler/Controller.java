package com.canberkanar.compiler;

import com.canberkanar.compiler.states.InitialState;
import com.canberkanar.compiler.states.SecondAndFinalState;
import com.canberkanar.compiler.states.State;

public class Controller {

    private String inputWord;
    private State automatonState;

    public Controller(String inputWord) {
        this.inputWord = inputWord;
        this.automatonState = new InitialState();
    }

    public void startAutomaton() {
        char currentChar;

        for (int i = 0; i < inputWord.length(); i++) {
            currentChar = inputWord.charAt(i);
            automatonState.performTransition(currentChar, this);
        }

        if (SecondAndFinalState.class == automatonState.getClass()) {
            System.out.println("Input word is an Accepted Word of the Automata.");
        } else {
            throw new AutomataException();
        }
    }

    public void setAutomatonState(State automatonState) {
        this.automatonState = automatonState;
    }
}
