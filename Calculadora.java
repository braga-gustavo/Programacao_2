package aula1;



import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener{
    
    JLabel num1, num2, resultado;
    JTextField txtFd1, txtFd2, txtFd3;
    JButton btnSoma, btnSubt, btnMult, btnDiv, btnLimpar;
    Calculadora(){
        
        super("Cadastro de Categorias");
        Container c = getContentPane();
        c.setBackground(new Color(150,150,150));
        c.setLayout(new GridLayout(3,4));
        
        //linha 1
        num1 = new JLabel("Num.1");
        num1.setForeground(new Color(0,0,0));
        num1.setFont(new Font("Arial",Font.BOLD,18));
        txtFd1 = new JTextField();
        btnSoma = new JButton("+");
        btnSubt = new JButton("-");
        
        //linha 2
        num2 = new JLabel("Num.2");
        txtFd2 = new JTextField();
        btnMult = new JButton("*");
        btnDiv = new JButton("/");
        
        // linha 3
        resultado = new JLabel("Total");
        txtFd3 = new JTextField();
        txtFd3.setEnabled(false);
        btnLimpar = new JButton("Limpar");
        btnLimpar.setBackground(Color.black);
        btnLimpar.setForeground(Color.white);
        
        setSize(600,200);
        setLocation(10, 10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        c.add(num1);
        c.add(txtFd1);
        c.add(btnSoma);
        c.add(btnSubt);
        
        c.add(num2);
        c.add(txtFd2);
        c.add(btnMult);
        c.add(btnDiv);
        
        c.add(resultado);
        c.add(txtFd3);
        c.add(btnLimpar);
        
        btnSoma.addActionListener(this);
        btnSubt.addActionListener(this);
        btnDiv.addActionListener(this);
        btnMult.addActionListener(this);
        btnLimpar.addActionListener(this);
        
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        double n1 = Double.parseDouble(txtFd1.getText());
        double n2 = Double.parseDouble(txtFd2.getText());
        double n3 = 0;
       
        
        if (btnSoma == e.getSource()) {
            n3 = n1 + n2;
            txtFd3.setText("" + n3);
        }
        
        else if (btnSubt == e.getSource()){
            n3 = n1 - n2;
            txtFd3.setText("" + n3);
            
        }
        
        else if (btnMult == e.getSource()){
            n3 = n1 * n2;
            txtFd3.setText("" + n3);
        }
        
        else if (btnDiv == e.getSource()){
            n3 = n1 / n2;
            txtFd3.setText("" + n3);
        }
        
        else if (btnLimpar == e.getSource()){
            txtFd1.setText("");
            txtFd2.setText("");
            txtFd3.setText("");
          }
        }
        
        catch(NumberFormatException expection){
            
            txtFd3.setText("Número Inválido");
            
        }
               
    }
    
   
       
    
    
    
    
}