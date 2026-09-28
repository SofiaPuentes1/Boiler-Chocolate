package main;

import boiler.ChocolateBoiler;

public class Main {

    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();

        System.out.println("______");
        System.out.println("case 1");
        System.out.println("______");
        System.out.println("Action: show the initial state");
        boiler.showState();

        System.out.println("______");
        System.out.println("case 2");
        System.out.println("______");
        System.out.println("Action: drain an empty boiler with heating element off");
        boiler.drain();

        System.out.println("______");
        System.out.println("case 3");
        System.out.println("______");
        System.out.println("Action: start mixing with an empty boiler");
        boiler.startMixing();

        System.out.println("______");
        System.out.println("case 4");
        System.out.println("______");
        System.out.println("Action: fill an empty boiler with heating element off");
        boiler.fill();

        System.out.println("______");
        System.out.println("case 5");
        System.out.println("______");
        System.out.println("Action: fill a boiler that is already full");
        boiler.fill();

        System.out.println("______");
        System.out.println("case 6");
        System.out.println("______");
        System.out.println("Action: start mixing with a full boiler and heating element off");
        boiler.startMixing();

        System.out.println("______");
        System.out.println("case 7");
        System.out.println("______");
        System.out.println("Action: turn on heating element and try to start mixing");
        boiler.turnOnHeatingElement();
        boiler.startMixing();

        System.out.println("______");
        System.out.println("case 8");
        System.out.println("______");
        System.out.println("Action: drain a full boiler with heating element on");
        boiler.drain();

        System.out.println("______");
        System.out.println("case 9");
        System.out.println("______");
        System.out.println("Action: turn off heating element and show the final state");
        boiler.turnOffHeatingElement();
        boiler.showState();

        System.out.println("_______");
        System.out.println("case 10");
        System.out.println("_______");
        System.out.println("Action: check that both references are the same singleton instance");
        ChocolateBoiler otherBoiler = ChocolateBoiler.getInstance();
        System.out.println("Same instance: " + (boiler == otherBoiler));
    }
}