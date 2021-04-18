package com.canberkanar.compiler.states;

import com.canberkanar.compiler.AutomataException;
import com.canberkanar.compiler.Controller;

public class SecondAndFinalState implements State {
    @Override
    public void performTransition(char consumedCharacter, Controller controller) {
        if ('f' == consumedCharacter) {
            controller.setAutomatonState(new ThirdState());
        } else {
            throw new AutomataException();
        }
    }
}
