package Aula01;

import java.awt.Color;
import java.awt.Container;
import java.awt.Event;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculadora extends JFrame implements ActionListener {
    
    JLabel num1, num2, result;
    JTextField campoTexto1, campoTexto2, campoTexto3;
    JButton btnSoma, btnSubt, btnMult, btnDiv, btnLimpar;
  
    
    Calculadora(){
        
        
        
        super("Calculadora");
        Container c = getContentPane();
        c.setBackground(new Color(150,150,150));
        c.setLayout(new GridLayout(3,4));
        
        //linha 1
        num1 = new JLabel("Num.1");
        num1.setForeground(new Color(0,0,0));
        num1.setFont(new Font ("Arial",Font.BOLD,18));
                
        campoTexto1 = new JTextField();
        btnSoma = new JButton("+");
        btnSubt = new JButton("-");
        
        //linha 2
        num2 = new JLabel("Num.2");
        num2.setForeground(new Color(0,0,0));
        num2.setFont(new Font ("Arial",Font.BOLD,18));
        
        campoTexto2 = new JTextField();
        
        btnMult = new JButton("*");
        
        btnDiv = new JButton("/");
        
        // linha 3
        result = new JLabel("Total");
        result.setForeground(new Color(0,0,0));
        result.setFont(new Font("Arial",Font.BOLD,18));
        
        campoTexto3 = new JTextField();
        campoTexto3.setEnabled(false);
        
        btnLimpar = new JButton("Limpar");
        btnLimpar.setBackground(new Color(0,0,0));
        btnLimpar.setForeground(new Color(255,255,255));
        
        
        
        
        
        
        
        setSize(379,175);
        setLocation(10, 10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        
        c.add(num1);
        c.add(campoTexto1);
        c.add(btnSoma);
        c.add(btnSubt);
        
        c.add(num2);
        c.add(campoTexto2);
        c.add(btnMult);
        c.add(btnDiv);
        
        c.add(result);
        c.add(campoTexto3);
        c.add(btnLimpar);
        
        btnSoma.addActionListener(this);
        btnSubt.addActionListener(this);
        btnMult.addActionListener(this);
        btnDiv.addActionListener(this);
        btnLimpar.addActionListener(this);
        setVisible(true);
    
         
     
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (btnSoma == e.getSource()){
            
           
        
        
        }
       
         
        if (btnSubt == e.getSource()){
            System.out.println("Subtração");
            
            
            
        
        }
       
         
        if (btnMult == e.getSource()){
            System.out.println("Multiplicação");
            
            
        
        
        }
       
         
        if (btnDiv == e.getSource()){
            System.out.println("Divisão");
            
            
        
        
        }
        
         if (btnLimpar == e.getSource()){
            System.out.println("Limpo");
        
       
        }
    
    
    
    
    }
}