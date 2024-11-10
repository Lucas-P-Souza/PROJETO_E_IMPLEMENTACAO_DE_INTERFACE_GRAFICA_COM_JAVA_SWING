package com.modulo03.lista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class ExercicioK extends JPanel {

    private JTree tree;

    public ExercicioK() {
        
        setLayout(null);

        tree();

    }

    public void tree() {
    
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("The Java Series");

        DefaultMutableTreeNode pasta1 = new DefaultMutableTreeNode("Book for Java I");
        DefaultMutableTreeNode pasta2 = new DefaultMutableTreeNode("Book for Java II");

        DefaultMutableTreeNode subPasta2_1 = new DefaultMutableTreeNode("The Java Virtual Machine");
        DefaultMutableTreeNode subPasta2_2 = new DefaultMutableTreeNode("The Java Language");

        pasta2.add(subPasta2_1);
        pasta2.add(subPasta2_2);

        root.add(pasta1);
        root.add(pasta2);

        tree = new JTree(root);
        tree.setBounds(10, 10, 200, 150);
        add(tree);

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("ExercicioK");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        ExercicioK exercicioK = new ExercicioK();
        frame.add(exercicioK);

        frame.setVisible(true);

    }
}
