package com.modulo05.ex6;

import javax.swing.*;
import java.awt.*;

public class InterestsPanel extends JPanel {
    private JList<String> interestList;
    private static DefaultListModel<String> selectedInterestsModel;
    
        public InterestsPanel() {
            setLayout(null);
            setPreferredSize(new Dimension(600, 70));
    
            JLabel interestsLabel = new JLabel("Interesses");
            interestsLabel.setBounds(10, 0, 100, 25);
            add(interestsLabel);
    
            interestList = new JList<>(new String[] { "Redes", "Internet", "Compiladores", "Segurança", "BD" });
            JScrollPane interestScrollPane = new JScrollPane(interestList);
            interestList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            interestScrollPane.setBounds(10, 30, 200, 100);
            add(interestScrollPane);
    
            selectedInterestsModel = new DefaultListModel<>();
            JList<String> selectedInterestsList = new JList<>(selectedInterestsModel);
            JScrollPane selectedInterestsScrollPane = new JScrollPane(selectedInterestsList);
            selectedInterestsScrollPane.setBounds(290, 30, 200, 100);
            add(selectedInterestsScrollPane);
    
            JPanel buttonsPanel = new JPanel();
            buttonsPanel.setLayout(new GridLayout(2, 1));
            JButton addInterestButton = new JButton(">>");
            JButton removeInterestButton = new JButton("<<");
            buttonsPanel.add(addInterestButton);
            buttonsPanel.add(removeInterestButton);
            buttonsPanel.setBounds(220, 45, 60, 60);
            add(buttonsPanel);
    
            addInterestButton.addActionListener(e -> {
                for (String selectedValue : interestList.getSelectedValuesList()) {
                    if (!selectedInterestsModel.contains(selectedValue)) {
                        selectedInterestsModel.addElement(selectedValue);
                    }
                }
            });
    
            removeInterestButton.addActionListener(e -> {
                for (String selectedValue : selectedInterestsList.getSelectedValuesList()) {
                    selectedInterestsModel.removeElement(selectedValue);
                }
            });
        }
    
        public static String getSelectedInterests() {
            StringBuilder interests = new StringBuilder();
            for (int i = 0; i < selectedInterestsModel.getSize(); i++) {
            interests.append(selectedInterestsModel.getElementAt(i)).append(", ");
        }
        if (interests.length() > 0) {
            interests.setLength(interests.length() - 2);
        }
        if (interests.toString().isEmpty()) {
            return "Nenhum interesse selecionado";
        }
        return interests.toString();
    }
}
