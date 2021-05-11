package Ejercicio1;

public class Libro {

    private String titulo;
    private float precio;
    private int stock;
    private Autor[] autores;


    public Libro()
    {

    }

    public Libro(String titulo,float precio,int stock,Autor[] autores)
    {
        this.titulo=titulo;
        this.precio=precio;
        this.stock=stock;
        this.autores=autores;

    }

    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setPrecio(float precio)
    {
        this.precio=precio;
    }

    public float getPrecio()
    {
        return precio;
    }

    public void setStock(int stock)
    {
        this.stock=stock;
    }
    public int getStock()
    {
        return stock;
    }


    public String imprimirLibro()
    {
        return "Ejercicio1.Libro = "+this.titulo + "  Precio = "+this.precio +"  Stock = "+this.stock;
    }

    public String imprimirMsje()
    {
        StringBuilder nomAutores = new StringBuilder();

        for(Autor autor : autores)
        {
            if(autor != null)
            {
                nomAutores.append(autor.getNombre());
                nomAutores.append(" ");
                nomAutores.append(autor.getApellido());
                nomAutores.append(" ");

            }
        }
        return "El libro, " + this.titulo + " de " + nomAutores + " se vende a " + this.precio + " pesos.";
    }




}
