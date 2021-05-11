package Ejercicio2;

import java.util.UUID;

public class Cliente {

    private String id;
    private String nombreApellido;
    private String email;
    private double descuento;


    public Cliente()
    {

    }

    public Cliente(String id,String nombreApellido,String email,double descuento)
    {
        this.id=id;
        this.nombreApellido=nombreApellido;
        this.email=email;
        this.descuento=descuento;
    }

    public void setId()
    {
        this.id=java.util.UUID.randomUUID().toString();  ///Sin el ToString() tendria que pasar a UUID la var 'id'
    }

    public String getId()
    {
        return id;
    }

    public void setNombreApellido(String nombreApellido)
    {
        this.nombreApellido=nombreApellido;
    }

    public String getNombreApellido()
    {
        return nombreApellido;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getEmail()
    {
        return email;
    }

    public void setDescuento(double desc)
    {
        this.descuento=desc;
    }

    public double getDescuento()
    {
        return descuento;
    }


    /*
    public String imprimirCliente() ///Fijarme si usa las var solas o el 'this.'
    {
        return "  ID cliente : "+id+" | Nombre y Apellido : "+nombreApellido+" |Email : "+email+" | Descuento de : "+descuento;
    }
     */

    @Override
    public String toString()
    {
        return "[ Cliente = "+"ID ="+id+" Nombre : "+nombreApellido+" Email : "+email+" Descuento : "+descuento+"]";
    }
}
