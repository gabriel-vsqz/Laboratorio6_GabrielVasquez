package laboratorio6_gabrielvasquez;

import java.util.ArrayList;

public class Inventario {
 
    private ArrayList<Producto> productos = new ArrayList();

    public Inventario() {
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Inventario " + productos;
    }
    
}