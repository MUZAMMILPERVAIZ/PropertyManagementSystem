package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResidentialProperty extends JFrame implements Objects {
    private JTextField O_city;
    private JTextField O_address;
    private JTextField O_cnic;
    private JTextField O_name;
    private JButton owner;
    private JTextField P_name;
    private JTextField P_address;
    private JTextField zip;
    private JTextField P_city;
    private JTextField description;
    private JTextField floors;
    private JTextField type;
    private JTextField P_space;
    private JPanel Residential;
    private JTextField O_email;
    private JButton property;
    private JButton agent;
    private JTextField A_name;
    private JTextField A_fees;
    private JTextField A_cnic;
    private JTextField A_city;
    private JTextField A_email;
    private JButton closeFormButton;

    public ResidentialProperty() {
        setContentPane(Residential);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(" INSERT RESIDENTIAL PROPERTY RECORD");
        setSize(700, 1000);
        setVisible(true);
        owner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < residentialProperties.size(); i++) {
                    residentialProperties.get(i).assignOwner(O_name.getText(), O_address.getText(), O_city.getText(), O_email.getText(), Integer.parseInt(O_cnic.getText()));
                }

            }
        });
        property.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Residential residential = new Residential();
                residential.addRecord(P_name.getText(), P_address.getText(), Integer.parseInt(zip.getText()), P_city.getText(), description.getText(), Integer.parseInt(floors.getText()), type.getText(), Integer.parseInt(P_space.getText()));
                residentialProperties.add(residential);
                JOptionPane.showMessageDialog(null, "Record Inserted");
                P_name.setEnabled(false);
                P_space.setEnabled(false);
                P_city.setEnabled(false);
                P_address.setEnabled(false);
                description.setEnabled(false);
                zip.setEnabled(false);
                type.setEnabled(false);
                floors.setEnabled(false);
                A_name.setEnabled(true);
                A_city.setEnabled(true);
                A_cnic.setEnabled(true);
                A_fees.setEnabled(true);
                A_email.setEnabled(true);

                O_email.setEnabled(true);
                O_cnic.setEnabled(true);
                O_city.setEnabled(true);
                O_name.setEnabled(true);
                O_address.setEnabled(true);


            }
        });
        agent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < residentialProperties.size(); i++) {
                    residentialProperties.get(i).assignAgent(A_name.getText(), Integer.parseInt(A_fees.getText()), A_city.getText(), A_email.getText(), Integer.parseInt(A_cnic.getText()));
                }
            }
        });
        closeFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
}
