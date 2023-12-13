package org.example.gui;

import org.example.Generator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class RandomizerApp extends JFrame{
    private JButton generateButton = new JButton("Сгенерировать");
    private JPanel mainPanel= new JPanel();
    private JLabel label = new JLabel("input:");
    private JTextField input = new JTextField(5);
    private JButton addButton= new JButton("add");
    private int setCount = 0;
    private Set<String> set= new HashSet<String>();
    private ArrayList<JTextField> addedTextField = new ArrayList<>();


    public RandomizerApp() {
        this.setBounds(500, 500, 500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,2,2,2));
        container.add(label);
        container.add(input);
        container.add(addButton);
        container.add(generateButton);

        generateButton.addActionListener(new ButtonGenerateListener());
        addButton.addActionListener(new ButtonAddListener());
    }

    class ButtonAddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setCount++;
            set.add(input.getText());
            System.out.println(set);
            //JOptionPane.showMessageDialog(null, set);

        }
    }

    class ButtonGenerateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            HashMap<String,String> map = Generator.generateMap(set);
            for (Map.Entry<String, String> pair: map.entrySet()){
                JOptionPane.showMessageDialog(null, (pair.getKey() + " дарит " + pair.getValue()));
            }

            //JOptionPane.showMessageDialog(null, "зачем ты нажал на кнопочку? не надо так! yamete kudasai");

        }
    }



    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
