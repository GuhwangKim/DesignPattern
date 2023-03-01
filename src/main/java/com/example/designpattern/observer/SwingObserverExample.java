package com.example.designpattern.observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("할까 말까?");
        button.addActionListener(e -> System.out.println("하지마"));
        button.addActionListener(e -> System.out.println("저질러"));
    }
//    class AngelListenr implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("하지마");
//        }
//    }
//    class DevilListener implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("저질러");
//        }
//    }

}
