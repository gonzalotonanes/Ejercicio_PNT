package ejercicio_pnt;

public class FrutaVerdura extends Alimento {

    private String unidadVenta;
    public FrutaVerdura(String nombre, double precio ) {
        super(nombre, precio);
        this.unidadVenta="kilo";
    }

    public FrutaVerdura() {
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
