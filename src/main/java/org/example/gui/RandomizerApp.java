package org.example.gui;

import org.example.Generator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class RandomizerApp extends JFrame {
    private JButton generateButton = new JButton("Сгенерировать");
    private JPanel mainPanel = new JPanel();
    private JLabel label = new JLabel("input:");
    private JTextField input = new JTextField(5);
    private JButton addButton = new JButton("Добавить");
    private int setCount = 0;
    private Set<String> set = new HashSet<String>();
    private List<String> list = new ArrayList<String>();
    private ArrayList<JTextField> addedTextField = new ArrayList<>();


    public RandomizerApp() {
        this.setBounds(500, 500, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 2, 2, 2));
        container.add(label);
        container.add(input);
        container.add(addButton);
        container.add(generateButton);
        //    addButton.addKeyListener(new KeyAddListener());

        generateButton.addActionListener(new ButtonGenerateListener());
        addButton.addActionListener(new ButtonAddListener());

    }

    class KeyAddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    class ButtonAddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            list.add(input.getText());
            System.out.println(list);
            input.setText("");
//            setCount++;
//            set.add(input.getText());
//            System.out.println(set);
//            input.setText("");
        }
    }

    class ButtonGenerateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String[] finalList = Generator.generateShuffledListVer2(list);
            String s = new String("");
            for (int i = 0; i < finalList.length; i++) {
                s=s+ finalList[i] + " получает подарок под номером " + (Integer)(i+1) + "\n";
            }
            System.out.println(s);
//            HashMap<String,String> map = Generator.generateShuffledList(set);
//            String s = new String("");
//            for (Map.Entry<String, String> pair: map.entrySet()){
//                s = s + pair.getKey() + " Получает подарок № " + pair.getValue() + "\n";
//
//            }
            JOptionPane.showMessageDialog(null, s);
            System.out.println(s);

            //JOptionPane.showMessageDialog(null, "зачем ты нажал на кнопочку? не надо так! yamete kudasai");

        }
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
