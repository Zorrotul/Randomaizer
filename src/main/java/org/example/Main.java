package org.example;

import org.example.gui.RandomizerApp;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        RandomizerApp app = new RandomizerApp();
        app.pack();
        app.setVisible(true);

        Set set = new HashSet<String>() {
        };
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        //set.add("5");
        //set.add("6");
        //set.add("7");
        //set.add("8");
        //set.add("9");
        //set.add("10");
        HashMap<String,String> map = Generator.generateMap(set);
        for (Map.Entry<String, String> pair: map.entrySet()){
            System.out.println(pair.getKey() + " дарит " + pair.getValue());
        }
    }
}