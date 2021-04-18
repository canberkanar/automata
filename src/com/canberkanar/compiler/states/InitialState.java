package com.canberkanar.compiler.states;

import com.canberkanar.compiler.AutomataException;
import com.canberkanar.compiler.Controller;

public class InitialState implements State {
    @Override
    public void performTransition(char consumedCharacter, Controller controller) {
        if ('a' == consumedCharacter) {
            controller.setAutomatonState(new FirstState());
        } else if ('b' == consumedCharacter) {
            controller.setAutomatonState(new SecondAndFinalState());
        } else {
            throw new AutomataException();
        }
    }
}
