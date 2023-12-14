package org.example;

import org.example.gui.RandomizerApp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        RandomizerApp app = new RandomizerApp();
        app.pack();
        app.setVisible(true);

        List set = new ArrayList<String>();
        set.add("Полина");
        set.add("Саша");
        set.add("Варя");
        set.add("Лёша");
        //set.add("5");
        //set.add("6");
        //set.add("7");
        //set.add("8");
        //set.add("9");
        //set.add("10");
        //String[] list = Generator.generateShuffledListVer2(set);
    }
}