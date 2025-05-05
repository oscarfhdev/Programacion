package com.GestionDeProductos.GestionDeProductos.Controllers;

import com.GestionDeProductos.GestionDeProductos.Models.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductoController {

    private List<Producto> productos = new ArrayList<>();
    private int idCounter = 0;

    public ProductoController() {
        // Añadimos algunos productos de ejemplos
        productos.add(new Producto(idCounter++, "PortatilOscar", 1080));
        productos.add(new Producto(idCounter++, "TabletJavi", 800));
        productos.add(new Producto(idCounter++, "AuricularesEster", 100));

    }

    @GetMapping("/productos")
    public List<Producto> obtenerProductos() {
        return productos;
    }

    @PostMapping("/producto")
    public Producto crearProducto(@RequestBody Producto producto) {
        producto.setId(idCounter++);
        productos.add(producto);
        return producto;
    }

    /*
    * @RequestBody capturar el cuerpo de una petición HTTP y lo convierte en un objeto Java
    * @PathVariable captura una parte (dato-variable) de la URL (en este caso un ID)
    *
    * */
    @PutMapping("/producto/{id}")
    public Producto actualizarProducto(@RequestBody Producto productoActualizado, @PathVariable int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                producto.setNombre(productoActualizado.getNombre());
                producto.setPrecio(productoActualizado.getPrecio());
                return producto;
            }
        }
        return null;
    }

    @DeleteMapping("/producto/{id}")
    public void eliminarProducto(@PathVariable int id) {
        productos.removeIf(producto -> producto.getId() == id);
    }

}
