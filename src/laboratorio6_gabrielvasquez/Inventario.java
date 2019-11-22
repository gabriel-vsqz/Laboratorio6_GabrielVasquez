package laboratorio6_gabrielvasquez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
 
    private ArrayList<Producto> productos = new ArrayList();
    private File archivo = null;

    public Inventario() {
    }
    
    public Inventario(String path) {
        this.archivo = new File(path);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Inventario " + productos;
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        productos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    productos.add(new Producto(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.next()));
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }
    
    public void escribirArchivo () throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Producto t : productos) {
                //String codigo, String marca, String nombre, int azucar, int alcohol, String pertenencia, int lote, int precio, int cantidad, String vencimiento
                bw.write(t.getCodigo()+ "|");
                bw.write(t.getMarca() + "|");
                bw.write(t.getNombre() + "|");
                bw.write(t.getAzucar() + "|");
                bw.write(t.getAlcohol() + "|");
                bw.write(t.getPertenencia() + "|");
                bw.write(t.getLote() + "|");
                bw.write(t.getPrecio() + "|");
                bw.write(t.getCantidad() + "|");
                bw.write(t.getVencimiento() + "|");
                bw.write(t.getColorantes() + "");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
}