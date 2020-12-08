package ejercicio_pnt;

public class ArtLimpiezaLiq extends ArtLimpieza {

    private int contenido;

    public ArtLimpiezaLiq(String nombre, double precio, int contenido) {
        super(nombre, precio, contenido);
        this.contenido = contenido;
    }

    public ArtLimpiezaLiq() {
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// Contenido: " + this.contenido + "ml /// Precio: $" + Conversion.borrarDecimales(this.precio);
    }

}
