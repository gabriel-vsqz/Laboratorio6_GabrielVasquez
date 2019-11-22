package laboratorio6_gabrielvasquez;

import java.util.ArrayList;

public class Producto {
 
    private String codigo;
    private String marca;
    private String nombre;
    private int azucar;
    private int alcohol;
    private String pertenencia;
    private int lote;
    private ArrayList<String> colorantes = new ArrayList();
    private int precio;
    private int cantidad;
    private String vencimiento;

    public Producto() {
    }

    public Producto(String codigo, String marca, String nombre, int azucar, int alcohol, String pertenencia, int lote, int precio, int cantidad, String vencimiento) {
        this.codigo = codigo;
        this.marca = marca;
        this.nombre = nombre;
        this.azucar = azucar;
        this.alcohol = alcohol;
        this.pertenencia = pertenencia;
        this.lote = lote;
        this.precio = precio;
        this.cantidad = cantidad;
        this.vencimiento = vencimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public int getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(int alcohol) {
        this.alcohol = alcohol;
    }

    public String getPertenencia() {
        return pertenencia;
    }

    public void setPertenencia(String pertenencia) {
        this.pertenencia = pertenencia;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public ArrayList<String> getColorantes() {
        return colorantes;
    }

    public void setColorantes(ArrayList<String> colorantes) {
        this.colorantes = colorantes;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    @Override
    public String toString() {
        return "" + nombre;
    }
    
}