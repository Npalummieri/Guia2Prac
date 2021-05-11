package Ejercicio3;

import java.util.UUID;

public class ClienteB {

    private UUID id;
    private String nombre;
    private char genero;

    public ClienteB()
    {

    }

    public ClienteB(String nombre,char genero)
    {
        this.id=UUID.randomUUID();
        this.nombre=nombre;
        this.genero=genero;
    }



    public UUID getId()
    {
        return id;
    }

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setGenero(char genero)
    {
        this.genero=genero;
    }

    public char getGenero()
    {
        return genero;
    }


    @Override
    public String toString()
    {
        return "[Cliente = Nombre y Apellido :"+nombre+" ID : "+id+" Genero : "+genero+"]";
    }

}
