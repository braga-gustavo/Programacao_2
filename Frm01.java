
package aula1;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Frm01 extends Panel {
    
    
    
    Frm01(){
         JPanel panel  = new JPanel();
         JFrame frame  = new JFrame();
         
         panel.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        JLabel lbl  = new JLabel("Num1 ");
        JLabel lbl2 = new JLabel("Num2");
        JLabel lbl3 = new JLabel("Total");
        
        JTextField txtFld = new JTextField();
        txtFld.setColumns(6);
        JTextField txtFld2 = new JTextField();
        txtFld2.setColumns(6);
        JTextField txtRes = new JTextField();
        txtRes.setColumns(6);
        
        JButton btn  = new JButton("+");
        JButton btn2 = new JButton ("-");
        JButton btn3 = new JButton ("X");
        JButton btn4 = new JButton ("/");
        JButton btn5 = new JButton ("Limpar");
        
        
        
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.pack();
        frame.setVisible(true);
        
       
       // Posicação campos de labels
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(lbl, gbc);
        
     
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(lbl2, gbc);
        
      
        gbc.gridx = 0;
        gbc.gridy = 2;  
        panel.add(lbl3, gbc);
       
      
        
       // Posicação campos de texto 
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(txtFld, gbc);
        
        
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(txtFld2,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(txtRes, gbc);
       
        
       
       // Posicação campos de botões
       
        gbc.gridx = 3;
        gbc.gridy = 0;
        add(btn, gbc); 
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(btn2, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(btn3, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(btn4, gbc);
       
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(btn5, gbc);
        
     
        
        
        
       
        
        
        
    }
    
    
    
    
    
    
}
