package Ejercicio2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Factura  {

    private String id;

    private String fecha;
    private Cliente cliente;
    private ItemVenta[] items;

    public Factura()
    {

    }

    public Factura(String id,String fecha,Cliente cliente,ItemVenta[] items)
    {
        this.id=id;

        this.fecha=fecha;
        this.cliente=cliente;
        this.items=items;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = java.util.UUID.randomUUID().toString();
    }

    public double getMontoTotal()
    {
        double total=0;
        for (ItemVenta itemVenta :items)
        {
            if(itemVenta !=null)
            {
                total = total+itemVenta.getTotal();
            }
        }
        return total - (total*cliente.getDescuento());
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha() {
        this.fecha = java.time.LocalDate.now().toString();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemVenta[] getItems() {
        return items;
    }



    /*
    public String imprimirFactura()
    {
        return "ID factura : "+id+" Monto total : "+montoTotal+" Fecha :"+fecha+" Cliente"+getCliente()+" Items :"+items;
    }
     */
    @Override
    public String toString()
    {
        return "[Factura : "+"ID :"+id+" Fecha : "+fecha+" Cliente"+cliente+" Items : "+ Arrays.toString(items) +"]";
    }


    /*public double totalDescuento(double desc)
    {
        double result=getMontoTotal()*desc;

        return getMontoTotal()-result;

    }

     */
}
