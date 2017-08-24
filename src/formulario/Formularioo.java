/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author Altair
 */
public class Formularioo extends JFrame implements ActionListener{
    private JLabel Titulo, Nombre, ApeP, ApeM, Grupo, Escuela;
    private JTextField num, gru, esc, apep, apem; 
    private JButton obtener;          

    public Formularioo() {
        super();                    
        Ventana();        
        inicializarComponentes();        
    }
      private void Ventana() {
        this.setTitle("Formulario");                   
        this.setSize(500, 400);                         
        this.setLayout(null);                                   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
      
    public void inicializarComponentes(){
        Titulo = new JLabel();
        Nombre = new JLabel();
        Grupo = new JLabel();
        Escuela = new JLabel();
        ApeP = new JLabel();
        ApeM = new JLabel();
        
        num = new JTextField();
        gru = new JTextField();
        esc = new JTextField();
        apep = new JTextField();
        apem = new JTextField();
        
        obtener = new JButton();
        
        Titulo.setText("FORMULARIO");
        Titulo.setBounds(50, 30, 200, 20);
        Titulo.setFont(new Font("Arial", Font.BOLD, 26));
        add(Titulo);
        
        Nombre.setText("Nombre:");
        Nombre.setBounds(20, 80, 100, 20);
        Nombre.setFont(new Font("Arial",Font.PLAIN, 20));
        add(Nombre);
        
        num.setBounds(100,80,150,20);
        add(num);
        
        ApeP.setText("Apellido Paterno:");
        ApeP.setBounds(20, 120, 200, 20);
        ApeP.setFont(new Font("Arial",Font.PLAIN, 20));
        add(ApeP);
        
        apep.setBounds(200,120,150,20);
        add(apep);
        
        ApeM.setText("Apellido Materno:");
        ApeM.setBounds(20, 160, 200, 20);
        ApeM.setFont(new Font("Arial",Font.PLAIN, 20));
        add(ApeM);
        
        apem.setBounds(200,160,150,20);
        add(apem);        

        Grupo.setText("Grupo:");
        Grupo.setBounds(20, 200, 100, 20);
        Grupo.setFont(new Font("Arial",Font.PLAIN, 20));
        add(Grupo);
        
        gru.setBounds(100,200,150,20);
        add(gru);
        
        Escuela.setText("Escuela:");
        Escuela.setBounds(20, 240, 100, 20);
        Escuela.setFont(new Font("Arial",Font.PLAIN, 20));
        add(Escuela);
        
        esc.setBounds(100,240,150,20);
        add(esc);
        
        obtener.setText("Guardar");
        obtener.setBounds(40, 290,200,30);
        obtener.setFont(new Font("Arial",Font.PLAIN, 20));
        obtener.addActionListener(this);
        add(obtener);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==obtener){
            Conexión c=new Conexión();
            try {
                c.Ward(num.getText(), apep.getText(), apem.getText(), gru.getText(), esc.getText());
                JOptionPane.showMessageDialog(this,"Datos Guardados","Datos Ward",JOptionPane.INFORMATION_MESSAGE);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Formularioo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
