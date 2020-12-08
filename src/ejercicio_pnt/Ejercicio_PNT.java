package ejercicio_pnt;

public class Ejercicio_PNT {

    public static void main(String[] args) {

        
        Supermercado sp = new Supermercado("Berazategui");

        sp = cargarProductos(sp);

        sp.listarProductos();
        System.out.println("=============================");
        sp.precioMasCaro();
        sp.precioMasBarato();

  
    }

    public static Supermercado cargarProductos(Supermercado sp) {
        Producto p1 = new Gaseosa("Coca-Cola Zero", 20, 1.5);
        Producto p2 = new Gaseosa("Coca-Cola", 18, 1.5);
        Producto p3 = new ArtLimpiezaLiq("Shampoo Sedal", 19, 500);
        Producto p4 = new FrutaVerdura("Frutilla", 64);

        sp.agregarProducto(p1);
        sp.agregarProducto(p2);
        sp.agregarProducto(p3);
        sp.agregarProducto(p4);
        
        return sp;
    }

}
