package ejercicio_pnt;

public class Bebida extends Producto {

    protected double litros;

    public Bebida(String nombre, double precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    public Bebida() {
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
