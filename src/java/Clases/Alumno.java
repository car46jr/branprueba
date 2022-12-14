/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author brand
 */
public class Alumno {
    private String nivel;
    private String seccion;
    private String profesor;
    private String nombre;
    private String correo;
    private String direccion;
    private String opcion;
    private int codigo;
    
    public Alumno(String nivel, String seccion, String profesor, String nombre, String correo, String direccion, String opcion, int codigo){
    
        this.nivel=nivel;
        this.seccion=seccion;
        this.codigo=codigo;
        this.profesor=profesor;
        this.nombre=nombre;
        this.correo=correo;
        this.direccion=direccion;     
        this.opcion=opcion;
        
    };


    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
}
