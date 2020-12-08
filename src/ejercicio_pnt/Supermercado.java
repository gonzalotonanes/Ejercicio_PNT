
package ejercicio_pnt;

import java.util.ArrayList;
import java.util.List;


public class Supermercado {
    
    private String nombre;
    private List<Producto> productos;
    //CONTRUCTORES
    public Supermercado(String nombre) {
        this.nombre = nombre;
        this.productos= new ArrayList<>();
    }

    public Supermercado() {
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
    
    public void listarProductos(){
        for (Producto p : productos) {
            System.out.println(p.toString());
        }
    }
    
    
    //METODO PARA MOSTRAR EL PRODUCTO MAS CARO
    public void precioMasCaro(){
        
        Producto auxProd= this.productos.get(0);
        
        for (int i = 1; i < productos.size(); i++) {
            if (this.productos.get(i).compareTo(auxProd)==1) {
                auxProd=productos.get(i);
            }
        }
        System.out.println("producto más caro: "+ auxProd.getNombre());
    }
    
    //METODO PARA MOSTRAR EL PRODUCTO MAS BARATO
    public void precioMasBarato(){
        Producto auxProd= this.productos.get(0);
        
           for (int i = 1; i < productos.size(); i++) {
            if (this.productos.get(i).compareTo(auxProd)==-1) {
                auxProd=productos.get(i);
            }
        }
        System.out.println("producto mÁs barato: "+ auxProd.getNombre());
    }
    
    
    
    
}
