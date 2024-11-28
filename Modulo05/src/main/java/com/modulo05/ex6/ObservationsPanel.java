package com.modulo05.ex6;

import javax.swing.*;
import java.awt.*;

public class ObservationsPanel extends JPanel {
    private static JTextArea observationsArea;
    
        public ObservationsPanel() {
    
            setLayout(null);
            setPreferredSize(new Dimension(600, 140));
    
            JLabel observationsLabel = new JLabel("Observações");
            observationsLabel.setBounds(10, 0, 100, 25);
            add(observationsLabel);
    
            observationsArea = new JTextArea(5, 20);
            JScrollPane observationsScrollPane = new JScrollPane(observationsArea);
            observationsScrollPane.setBounds(10, 25, 480, 150);
            add(observationsScrollPane);
    
        }
    
        public static String getObservations() {
            if (observationsArea.getText().isEmpty()) {
                return "Nenhuma observação";
            }
            return observationsArea.getText();
    }
}