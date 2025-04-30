package com.GestionDeProductos.GestionDeProductos.Controllers;

import com.GestionDeProductos.GestionDeProductos.Models.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductoController {

    List<Producto> productos = new ArrayList<>();
    int idCounter = 0;

    @GetMapping("/productos")
    public List<Producto> obtenerProducto() {
        return productos;
    }

    @PostMapping("/productos")
    public Producto crearProducto(@RequestBody Producto producto) {
        producto.setId(idCounter++);
        productos.add(producto);
        return producto;
    }

    @PutMapping("/prodfucto/{id}")
    public Producto actualizarProducto(@RequestBody Producto productoActualizado, @PathVariable int id) {

        for (Producto producto : productos) {
            if (producto.getId() == id) {
                producto.setNombre(productoActualizado.getNombre());
                producto.setPrecio((productoActualizado.getPrecio()));
                return producto;
            }
        }
        return null;
    }

    ArrayList<Producto> productosss = new ArrayList<>();

    @DeleteMapping("/producto/{id}")
    public void eliminarProducto(@PathVariable int id) {
        productos.removeIf(producto -> producto.getId() == id);
    }
}