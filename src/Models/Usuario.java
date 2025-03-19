/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author antho
 */
public class Usuario {

    private String nombre;
    private String rut;
    private String Cargo;
    private int horasSemanales;
    private double sueldoBruto;
    private String sistemaPrevencional;

    public Usuario() {
    }

    public Usuario(String nombre, String rut, String Cargo, int horasSemanales, double sueldoBruto, String sistemaPrevencional) {
        this.nombre = nombre;
        this.rut = rut;
        this.Cargo = Cargo;
        this.horasSemanales = horasSemanales;
        this.sueldoBruto = sueldoBruto;
        this.sistemaPrevencional = sistemaPrevencional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public String getSistemaPrevencional() {
        return sistemaPrevencional;
    }

    public void setSistemaPrevencional(String sistemaPrevencional) {
        this.sistemaPrevencional = sistemaPrevencional;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", rut=" + rut + ", Cargo=" + Cargo + ", horasSemanales=" + horasSemanales + ", sueldoBruto=" + sueldoBruto + ", sistemaPrevencional=" + sistemaPrevencional + '}';
    }

}
