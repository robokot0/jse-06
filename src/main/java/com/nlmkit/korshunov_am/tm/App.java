package com.nlmkit.korshunov_am.tm;

import java.util.Arrays;

import static com.nlmkit.korshunov_am.tm.TerminalConst.*;

/**
 *  Тестовое приложение
 */
public class App {

    public static void main(String[] args) {
        run(args);
        displayWelcome();
    }
    /**
     * Обработка параметров
     * @param args список параметров командной строки
     */
    private static void run(final String[] args) {
        if (args == null) return;
        if (args.length <1) return;
        final String param = args[0];
        switch (param) {
            case VERSION: displayVersion();
            case ABOUT: displayAbout();
            case HELP: displayHelp();
            default:displayError(args);
        }
    }

    private static void displayError(final String[] args){
        System.out.println("Error! Unknown program argument.");
        System.out.println(Arrays.toString(args));
        System.exit(-1);
    }

    private static void displayWelcome(){
        System.out.println("**** WELCOME TO TASK MANAGER ****");
    }

    private static void displayVersion() {
        System.out.println("1.0.0");
        System.exit(0);
    }

    private static void displayHelp() {
        System.out.println("Possible parameter values:");
        System.out.println("version - Display version");
        System.out.println("about - Display developer info");
        System.out.println("help - Display list of command");
        System.exit( 0);

    }

    private static void displayAbout() {
        System.out.println("Andrey Korshunov");
        System.out.println("korshunov_am@nlmk.com");
        System.exit( 0);
    }

}
