
package ejercicio_pnt;


public class Gaseosa extends Bebida{

    private double litros;
    public Gaseosa(String nombre, double precio, double litros) {
        super(nombre, precio);
        this.litros=litros;
    }

    public Gaseosa() {
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
    
    
    
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Litros: " + this.litros + " /// " + "Precio: $" + Conversion.borrarDecimales(this.precio);
    }

   
    
    
    
}
