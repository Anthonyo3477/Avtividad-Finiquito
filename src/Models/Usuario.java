package Models;

public class Usuario {

    private String nombre;
    private String rut;
    private String cargo;
    private int horasSemanales;
    private double sueldoBruto;
    private String sistemaPrevisional;

    public Usuario() {
    }

    public Usuario(String nombre, String rut, String cargo, int horasSemanales, double sueldoBruto, String sistemaPrevisional) {
        this.nombre = nombre;
        this.rut = rut;
        this.cargo = cargo;
        this.horasSemanales = horasSemanales;
        this.sueldoBruto = sueldoBruto;
        this.sistemaPrevisional = sistemaPrevisional;
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
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public String getSistemaPrevisional() {
        return sistemaPrevisional;
    }

    public void setSistemaPrevisional(String sistemaPrevisional) {
        this.sistemaPrevisional = sistemaPrevisional;
    }

    @Override
    public String toString() {
        return "Usuario{"
                + "nombre='" + nombre + '\''
                + ", rut='" + rut + '\''
                + ", cargo='" + cargo + '\''
                + ", horasSemanales=" + horasSemanales
                + ", sueldoBruto=" + sueldoBruto
                + ", sistemaPrevisional='" + sistemaPrevisional + '\''
                + '}';
    }

    // Método para calcular el sueldo líquido
    public double calcularSueldoLiquido() {
        double afp = sueldoBruto * 0.10;                                    // Descuento AFP (10%)
        double salud = sueldoBruto * 0.07;                                  // Descuento Salud (7%)
        double impuesto = sueldoBruto > 1500000 ? sueldoBruto * 0.04 : 0;   // Impuesto adicional si sueldo > 1.5M CL

        double descuentos = afp + salud + impuesto;
        return sueldoBruto - descuentos;

    }
}
