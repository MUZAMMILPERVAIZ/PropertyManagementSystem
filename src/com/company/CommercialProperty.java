package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommercialProperty extends JFrame implements Objects {
    private JPanel commercial;
    private JTextField O_name;
    private JTextField P_name;
    private JTextField P_address;
    private JTextField zip;
    private JTextField P_city;
    private JTextField description;
    private JTextField sq_feet;
    private JTextField price;
    private JTextField P_space;
    private JTextField A_name;
    private JTextField A_fees;
    private JTextField A_cnic;
    private JTextField O_address;
    private JTextField O_cnic;
    private JTextField O_city;
    private JTextField O_email;
    private JTextField A_city;
    private JTextField A_email;
    private JButton owner;
    private JButton agent;
    private JButton property;
    private JButton closeFormButton;

    public CommercialProperty() {
        setContentPane(commercial);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(" INSERT COMMERCIAL PROPERTY RECORD");
        setSize(700, 1000);
        setVisible(true);
        property.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Commercial commercial1 = new Commercial();
                commercial1.addRecord(P_name.getText(), P_address.getText(), Integer.parseInt(zip.getText()), P_city.getText(), description.getText(), Integer.parseInt(sq_feet.getText()), Float.parseFloat(price.getText()), Integer.parseInt(P_space.getText()));
                commercialProperties.add(commercial1);
                JOptionPane.showMessageDialog(null, "Record Inserted");
                P_name.setEnabled(false);
                P_space.setEnabled(false);
                P_city.setEnabled(false);
                P_address.setEnabled(false);
                description.setEnabled(false);
                zip.setEnabled(false);
                price.setEnabled(false);
                sq_feet.setEnabled(false);
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
        owner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < commercialProperties.size(); i++) {
                    commercialProperties.get(i).assignOwner(O_name.getText(), O_address.getText(), O_city.getText(), O_email.getText(), Integer.parseInt(O_cnic.getText()));
                }

            }
        });
        agent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < commercialProperties.size(); i++) {
                    commercialProperties.get(i).assignAgent(A_name.getText(), Integer.parseInt(A_fees.getText()), A_city.getText(), A_email.getText(), Integer.parseInt(A_cnic.getText()));
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
