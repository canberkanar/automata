package com.canberkanar.compiler;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String inputWord = scanner.nextLine();

        Controller controller = new Controller(inputWord);
        controller.startAutomaton();
    }
}
