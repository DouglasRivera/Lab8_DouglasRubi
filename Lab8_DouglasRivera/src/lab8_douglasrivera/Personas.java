/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_douglasrivera;

/**
 *
 * @author river
 */
public class Personas {
    int Id;
    String Nombre;
    String Apellido;
    String Nacionalidad;
    String Residencia;
    String Sexo;
    int NumeroCuenta;
    String Profesion;
    String LugarTrabajo;
    String Facultad;
    String TipoPersona;

    public Personas() {
    }

    public Personas(int Id, String Nombre, String Apellido, String Nacionalidad, String Residencia, String Sexo, int NumeroCuenta, String Profesion, String LugarTrabajo, String Facultad, String TipoPersona) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nacionalidad = Nacionalidad;
        this.Residencia = Residencia;
        this.Sexo = Sexo;
        this.NumeroCuenta = NumeroCuenta;
        this.Profesion = Profesion;
        this.LugarTrabajo = LugarTrabajo;
        this.Facultad = Facultad;
        this.TipoPersona = TipoPersona;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getResidencia() {
        return Residencia;
    }

    public void setResidencia(String Residencia) {
        this.Residencia = Residencia;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getLugarTrabajo() {
        return LugarTrabajo;
    }

    public void setLugarTrabajo(String LugarTrabajo) {
        this.LugarTrabajo = LugarTrabajo;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    public String getTipoPersona() {
        return TipoPersona;
    }

    public void setTipoPersona(String TipoPersona) {
        this.TipoPersona = TipoPersona;
    }
    
}
