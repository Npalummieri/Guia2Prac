package Ejercicio2;

import java.util.Arrays;
import java.util.UUID;

public class ItemVenta {

    private String id;
    private String nombre;
    private String descripcion;
    private double Uprecio;
    private int cantidad;

    public ItemVenta() {

    }

    public ItemVenta(String id, String nombre, String descripcion, double Uprecio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.Uprecio = Uprecio;
        this.cantidad = cantidad;

    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setUprecio(double Uprecio) {
        this.Uprecio = Uprecio;
    }

    public double getUprecio() {
        return Uprecio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal()
    {
        return Uprecio*cantidad;
    }

    /*
    public String imprimirItem()
    {
        return "Producto : "+nombre+" Id : "+id+" Descripcion : "+descripcion+" Precio : "+Uprecio+" Cantidad : "+cantidad;
    }
     */

    @Override
    public String toString()
    {
        return "[Producto : "+nombre+" ID : "+id+" Descripcion : "+descripcion+" Precio Unitario : "+Uprecio+
                " Cantidad : "+cantidad+"]";
    }



}
