/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import static java.lang.System.out;
import java.sql.*;

/**
 *
 * @author Altair
 */
public class Conexión {
    Connection c=null;
    Statement s=null;
    PreparedStatement p=null;
    
    public void Ward(String nom,String app,String apm,String grup,String esc) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c=DriverManager.getConnection("jdbc:mysql://localhost/Base","root","n0m3l0");
            s=c.createStatement();
        }
        catch(SQLException error){
            out.println(error);
        }
        
        try{
            p=c.prepareStatement("insert into Formu (nom,apep,apem,esc,grupo) values (?,?,?,?,?);");
            p.setString(1, nom);
            p.setString(2, app);
            p.setString(3, apm);
            p.setString(4, esc);
            p.setString(5, grup);
            p.executeUpdate();
        }catch(SQLException error){
            out.println(error);
        }
    }
    
}

