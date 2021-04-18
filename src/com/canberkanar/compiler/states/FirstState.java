package com.canberkanar.compiler.states;

import com.canberkanar.compiler.AutomataException;
import com.canberkanar.compiler.Controller;

public class FirstState implements State {
    @Override
    public void performTransition(char consumedCharacter, Controller controller) {
        if ('c' == consumedCharacter) {
            controller.setAutomatonState(new ThirdState());
        } else if ('d' == consumedCharacter) {
            controller.setAutomatonState(new SecondAndFinalState());
        } else {
            throw new AutomataException();
        }
    }
}
