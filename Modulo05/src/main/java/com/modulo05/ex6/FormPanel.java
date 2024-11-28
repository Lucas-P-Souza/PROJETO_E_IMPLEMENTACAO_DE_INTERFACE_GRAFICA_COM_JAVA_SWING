package com.modulo05.ex6;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FormPanel extends JPanel {

    private JTextField nameField;
    private JTextField addressField;
    private JTextField cityField;
    private JComboBox<String> stateComboBox;
    private JRadioButton maleRadio;
    private JRadioButton femaleRadio;
    private JCheckBox course1CheckBox;
    private JCheckBox course2CheckBox;
    private JCheckBox course3CheckBox;

    public FormPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(600, 98));

        JLabel nameLabel = new JLabel("Nome:");
        nameLabel.setBounds(10, 10, 100, 25);
        add(nameLabel);

        nameField = new JTextField(20);
        nameField.setBounds(90, 10, 300, 25);
        add(nameField);

        JButton insertButton = new JButton("Inserir");
        insertButton.setBounds(400, 10, 90, 30);
        insertButton.addActionListener(e -> {

            String nome = getName();
            String endereco = getAddress();
            String cidade = getCity();
            String estado = getState();
            String sexo = getGender();
            String cursos = getCourses();
            String interesses = InterestsPanel.getSelectedInterests();
            String observacoes = ObservationsPanel.getObservations();

            System.out.println("Nome: " + nome);
            System.out.println("Endereço: " + endereco);
            System.out.println("Cidade: " + cidade);
            System.out.println("Estado: " + estado);
            System.out.println("Sexo: " + sexo);
            System.out.println("Cursos: " + cursos);
            System.out.println("Interesses Selecionados: " + interesses);
            System.out.println("Observações: " + observacoes);
            System.out.println("----------------------------");

            File file = new File("dados_usuario.txt");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.write("Nome: " + nome);
                writer.newLine();
                writer.write("Endereço: " + endereco);
                writer.newLine();
                writer.write("Cidade: " + cidade);
                writer.newLine();
                writer.write("Estado: " + estado);
                writer.newLine();
                writer.write("Sexo: " + sexo);
                writer.newLine();
                writer.write("Cursos: " + cursos);
                writer.newLine();
                writer.write("Interesses Selecionados: " + interesses);
                writer.newLine();
                writer.write("Observações: " + observacoes);
                writer.newLine();
                writer.write("----------------------------");
                writer.newLine();
                System.out.println("Dados salvos no arquivo 'dados_usuario.txt'");
            }
            catch (IOException ex) {
                ex.printStackTrace();
                System.out.println("Erro ao salvar os dados no arquivo.");
            }
        });
       
        add(insertButton);

        JLabel addressLabel = new JLabel("Endereço:");
        addressLabel.setBounds(10, 40, 100, 25);
        add(addressLabel);

        addressField = new JTextField(20);
        addressField.setBounds(90, 40, 300, 25);
        add(addressField);

        JLabel cityLabel = new JLabel("Cidade:");
        cityLabel.setBounds(10, 70, 100, 25);
        add(cityLabel);

        cityField = new JTextField(10);
        cityField.setBounds(90, 70, 150, 25);
        add(cityField);

        JLabel stateLabel = new JLabel("Estado:");
        stateLabel.setBounds(260, 70, 100, 25);
        add(stateLabel);

        stateComboBox = new JComboBox<>(new String[] {
                "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS",
                "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC",
                "SP", "SE", "TO"
        });
        stateComboBox.setBounds(308, 70, 80, 25);
        add(stateComboBox);

        JLabel genderLabel = new JLabel("Sexo:");
        genderLabel.setBounds(10, 100, 100, 25);
        add(genderLabel);

        maleRadio = new JRadioButton("Masculino");
        maleRadio.setBounds(85, 100, 90, 25);
        femaleRadio = new JRadioButton("Feminino");
        femaleRadio.setBounds(175, 100, 100, 25);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        add(maleRadio);
        add(femaleRadio);

        JLabel coursesLabel = new JLabel("Opções:");
        coursesLabel.setBounds(10, 125, 100, 25);
        add(coursesLabel);

        course1CheckBox = new JCheckBox("Curso 1");
        course1CheckBox.setBounds(120, 125, 100, 25);
        course2CheckBox = new JCheckBox("Curso 2");
        course2CheckBox.setBounds(220, 125, 100, 25);
        course3CheckBox = new JCheckBox("Curso 3");
        course3CheckBox.setBounds(320, 125, 100, 25);

        add(course1CheckBox);
        add(course2CheckBox);
        add(course3CheckBox);
    }

    public String getName() {
        return nameField.getText();
    }

    public String getAddress() {
        return addressField.getText();
    }

    public String getCity() {
        return cityField.getText();
    }

    public String getState() {
        return (String) stateComboBox.getSelectedItem();
    }

    public String getGender() {
        if (maleRadio.isSelected()) {
            return "Masculino";
        } else if (femaleRadio.isSelected()) {
            return "Feminino";
        } else {
            return "Não especificado";
        }
    }

    public String getCourses() {
        StringBuilder courses = new StringBuilder();
        if (course1CheckBox.isSelected())
            courses.append("Curso 1, ");
        if (course2CheckBox.isSelected())
            courses.append("Curso 2, ");
        if (course3CheckBox.isSelected())
            courses.append("Curso 3, ");
        if (courses.length() > 0) {
            courses.setLength(courses.length() - 2);
        }
        return courses.toString();
    }
}
