/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lab8_douglasrivera.Personas;


/**
 *
 * @author river
 */
public class PersonasDBA {
    public int crear(Personas p){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Personas (Nombre, Apellido, Nacionalidad, Residencia, Sexo, NumeroCuenta, Profesion, LugarTrabajo, Facultad, TipoPersona) values (?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, p.getNombre());
                pst.setString(2, p.getApellido());
                pst.setString(3, p.getNacionalidad());
                pst.setString(4, p.getFacultad());
                pst.setString(5, p.getSexo());
                pst.setInt(6, p.getNumeroCuenta());
                pst.setString(7, p.getProfesion());
                pst.setString(8, p.getLugarTrabajo());
                pst.setString(9, p.getFacultad());
                pst.setString(10, p.getTipoPersona());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public int actualizar(Personas p){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "update Personas set Nombre = ?,Apellido = ?, Nacionalidad = ?, Residencia = ?, Sexo = ?, NumeroCuenta = ?, Profesion = ?, LugarTrabajo = ?, Facultad = ?, TipoPersona = ? where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, p.getNombre());
                pst.setString(2, p.getApellido());
                pst.setString(3, p.getNacionalidad());
                pst.setString(4, p.getFacultad());
                pst.setString(5, p.getSexo());
                pst.setInt(6, p.getNumeroCuenta());
                pst.setString(7, p.getProfesion());
                pst.setString(8, p.getLugarTrabajo());
                pst.setString(9, p.getFacultad());
                pst.setString(10, p.getTipoPersona());
                pst.setInt(11, p.getId());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public int eliminar(int id){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "delete from Personas where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public ArrayList<Personas> obtenerTodos(){
        try
            {
                ArrayList<Personas> p = new ArrayList<>();
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                String sql = "select * from Personas";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    p.add(new Personas(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7), rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)));
                }
                dba.desconectar();
                return p;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return new ArrayList<>();
            }
    }
    
    public Personas obtenerPorId(int id){
        try
            {
                Personas p = null;
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                 String sql = "select * from Personas where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery(sql);
                while(rs.next()){
                    p = new Personas(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7), rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
                }
                dba.desconectar();
                return p;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return null;
            }
    }
}
