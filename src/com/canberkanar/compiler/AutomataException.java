package com.canberkanar.compiler;

public class AutomataException extends RuntimeException {
    public AutomataException() {
        super("Input word is NOT an Accepted Word of the Automata!");
    }
}
