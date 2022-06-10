package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame  implements Objects{
    private JPanel dashboard;
    private JTabbedPane doctorpane;
    private JButton showPropertyRecord1;
    private JButton viewPatient;
    private JButton insertPropertyRecord1;

    private JPanel header;
    private JPanel body;
    private JButton insertRecordPatient;

    private JButton showRecordPatient;
    private JButton insertRecordStaff;
    private JButton showRecordStaff;
    private JButton insertRecordRecp;
    private JButton showRecordRecp;
    private JButton insertRecordDriver;
    private JButton showRecordDriver;
    private JButton insertRecordTransport;
    private JButton showRecordTransport;
    private JButton showTransportDriver;
    private JButton insertWardRecord;
    private JButton showWardRecord;
    private JTextArea result1;
    private JTextArea result2;
    private JButton showOwnerRecord1;
    private JButton showAgentRecord1;
    private JButton insertPropertyCommercial;
    private JButton showRecordCommercial;
    private JButton commercialAgent;
    private JButton commercialOwner;
    private JTextArea staffresult;
    private JTextArea driverResult;
    private JButton viewDoctorWard;
    private JButton viewPatientWard;
    private JTextArea wardsResult;
    private JTextArea transportResult;
    private JTextArea recpResult;

    Dashboard(){
        setContentPane(dashboard);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setSize(900,500);
        header.setSize(900,200);
        setVisible(true);


        insertPropertyRecord1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ResidentialProperty();
            }
        });
        showPropertyRecord1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result1.setText("");
                for (int i = 0; i < residentialProperties.size(); i++) {
                    result1.setText(result1.getText()+" Record No: "+(i+1)+"\n"+residentialProperties.get(i));
                }
            }
        });
        showAgentRecord1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result1.setText("");
                for (int i = 0; i < residentialProperties.size(); i++) {
                    result1.setText(result1.getText()+" Record No: "+(i+1)+"\n"+residentialProperties.get(i).getAgent());
                }
            }
        });
        showOwnerRecord1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result1.setText("");
                for (int i = 0; i < residentialProperties.size(); i++) {
                    result1.setText(result1.getText()+" Record No: "+(i+1)+"\n"+residentialProperties.get(i).getOwner());
                }
            }
        });
        showRecordCommercial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result2.setText("");
                for (int i = 0; i < commercialProperties.size(); i++) {
                    result2.setText(result2.getText()+" Record No: "+(i+1)+"\n"+commercialProperties.get(i));
                }
            }
        });
        commercialAgent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result2.setText("");
                for (int i = 0; i < commercialProperties.size(); i++) {
                    result2.setText(result2.getText()+" Record No: "+(i+1)+"\n"+commercialProperties.get(i).getAgent());
                }
            }
        });
        commercialOwner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result2.setText("");
                for (int i = 0; i < commercialProperties.size(); i++) {
                    result2.setText(result2.getText()+" Record No: "+(i+1)+"\n"+commercialProperties.get(i).getOwner());
                }
            }
        });
        insertPropertyCommercial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    new CommercialProperty();
            }
        });
    }
}
