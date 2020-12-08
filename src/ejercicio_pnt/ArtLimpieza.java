package ejercicio_pnt;

public abstract class ArtLimpieza extends Producto {

    protected int contenido;

    public ArtLimpieza(String nombre, double precio, int contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public ArtLimpieza() {
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// Contenido: " + this.contenido + "ml /// Precio: $" + Conversion.borrarDecimales(this.precio);
    }
}
