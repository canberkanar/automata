package com.canberkanar.compiler.states;

import com.canberkanar.compiler.Controller;

public interface State {

    void performTransition(char consumedCharacter, Controller controller);
}
