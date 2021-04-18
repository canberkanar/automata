package com.canberkanar.compiler.states;

import com.canberkanar.compiler.AutomataException;
import com.canberkanar.compiler.Controller;

public class ThirdState implements State {
    @Override
    public void performTransition(char consumedCharacter, Controller controller) {
        if ('e' == consumedCharacter) {
            controller.setAutomatonState(new FirstState());
        } else {
            throw new AutomataException();
        }
    }
}
