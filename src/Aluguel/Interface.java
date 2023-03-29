package Aluguel;

import java.awt.Container;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface {

    static public JFrame frame;

    public static void main(String[] args) throws ParseException {
        frame = new JFrame("Aluguel de Veículos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(null);

        //Label Dados do Cliente
        JLabel dados = new JLabel ("Dados do Cliente:");
        dados.setBounds(80,0,100,20);
        frame.add(dados);

        //Label Nome Cliente
        JLabel lblNome = new JLabel("Nome: ", JLabel.LEFT);
        lblNome.setBounds(80,30,60,20);
        frame.add(lblNome);

        //Input texto nome cliente
        JTextField nome = new JTextField();
        nome.setBounds(120,30,110,20);
        frame.add(nome);

        //Label CPF
        JLabel lblCPF = new JLabel("CPF: ", JLabel.LEFT);
        lblCPF.setBounds(80,60,60,20);
        frame.add(lblCPF);

        //Input texto CPF
        JFormattedTextField cpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        cpf.setBounds(120,60,110,20);
        frame.add(cpf);

        //Label Telefone
        JLabel tel = new JLabel("Tel: ", JLabel.LEFT);
        tel.setBounds(80,90,60,20);
        frame.add(tel);

        //Input texto telefone
        JFormattedTextField telefone = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
        telefone.setBounds(120,90,110,20);
        frame.add(telefone);

        //Label Dados do Carro
        JLabel dadosCarro = new JLabel ("Dados do Carro:");
        dadosCarro.setBounds(80,120,100,20);
        frame.add(dadosCarro);

        //Label Nome Carro
        JLabel nomeCarro = new JLabel("Nome: ", JLabel.LEFT);
        nomeCarro.setBounds(80,150,60,20);
        frame.add(nomeCarro);

        //Input texto nome carro
        JTextField carro = new JTextField();
        carro.setBounds(120,150,110,20);
        frame.add(carro);

        //Label Placa
        JLabel placa = new JLabel("Placa: ", JLabel.LEFT);
        placa.setBounds(80,180,60,20);
        frame.add(placa);

        //Input texto placa
        JFormattedTextField placaCarro = new JFormattedTextField(new MaskFormatter("???-####"));
        placaCarro.setBounds(120,180,110,20);
        frame.add(placaCarro);

        //Label Ano
        JLabel ano = new JLabel("Ano: ", JLabel.LEFT);
        ano.setBounds(80,210,60,20);
        frame.add(ano);

        //Input texto ano
        JFormattedTextField anoCarro = new JFormattedTextField(new MaskFormatter("####/####"));
        anoCarro.setBounds(120,210,110,20);
        frame.add(anoCarro);

        //Label Data Locação
        JLabel data = new JLabel("Data de Locação: ", JLabel.LEFT);
        data.setBounds(10,240,105,20);
        frame.add(data);

        //Input texto data locação
        JFormattedTextField dataLocacao = new JFormattedTextField(new MaskFormatter("##/##/####"));
        dataLocacao.setBounds(120,240,110,20);
        frame.add(dataLocacao);

        //Label Data Locação
        JLabel dataE = new JLabel("Data da Entrega: ", JLabel.LEFT);
        dataE.setBounds(10,270,105,20);
        frame.add(dataE);

        //Input texto data entrega
        JFormattedTextField dataEntrega = new JFormattedTextField(new MaskFormatter("##/##/####"));
        dataEntrega.setBounds(120,270,110,20);
        frame.add(dataEntrega);

        //Botão salvar
        JButton btnSubmit = new JButton("Salvar");
        btnSubmit.setBounds(150,300,80,20);
        frame.add(btnSubmit);

        if(nome.getText().toString() == "" || cpf.getText().toString() == "" || telefone.getText().toString() == "" || anoCarro.getText().toString() == "" || dataLocacao.getText().toString() == "" || dataEntrega.getText().toString() == "") {
            btnSubmit.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent arg0) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");

                }
            });
        } else {
            btnSubmit.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent arg0) {
                    JOptionPane.showMessageDialog(null, "Aluguel realizado com sucesso!");

                }
            });
        }

        frame.setVisible(true);
    }
}
