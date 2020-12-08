
package ejercicio_pnt;


public abstract class AlimentoKg extends Producto{

    protected String unidadVenta;
    public AlimentoKg(String nombre, double precio ) {
        super(nombre, precio);
        this.unidadVenta="Kg";
       
    }

    public AlimentoKg( ) {
        
    }

    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }

 
     @Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// Precio: $" + Conversion.borrarDecimales(this.precio) + " /// Unidad de venta: " + this.unidadVenta;
    }

   
   
    
    
}
