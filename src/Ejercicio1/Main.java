package Ejercicio1;

import Ejercicio2.Cliente;
import Ejercicio2.Factura;
import Ejercicio2.ItemVenta;
import Ejercicio3.ClienteB;
import Ejercicio3.Cuenta;

public class Main {

    public static void main(String[] args) {


        /*
        Autor[] autores = new Autor[5];

        Autor josh = new Autor("Joshua","Bloch","joshuabloch@gmail.com",'m');

        System.out.println(josh.imprimirAutor());


        System.out.println(josh.toString());

        autores[0]=josh;


        Libro java = new Libro("Effective Java",450,150,autores);
        System.out.println(java.imprimirLibro());

        System.out.println(java.imprimirMsje());




        Cliente client = new Cliente("", ///Averiguar como puedo rellenar la ID en el instanciamento
                " Juan Perez",  ///rta : directamente que 'id' sea de tipo UUID en vez de String
                "juanperez@gmail.com",
                0.02);

        ItemVenta itemVenta1 = new ItemVenta("","Diccionario","Lengua española unicamente",80,2);
        ItemVenta itemVenta2 = new ItemVenta("","Carpeta","Anillado triple",25.50,2);
        ItemVenta itemVenta3 = new ItemVenta("","Cartuchera","Doble piso",125,1);
        itemVenta1.setId();
        itemVenta2.setId();
        itemVenta3.setId();

        ItemVenta[] productos = new ItemVenta[3];
        productos[0]=itemVenta1;
        productos[1]=itemVenta2;
        productos[2]=itemVenta3;
        client.setId();


        Factura facturita =new Factura("","",client,productos);
        facturita.setId();
        facturita.setFecha();

        System.out.println(facturita);

        System.out.println(facturita.getMontoTotal());

        */


        ClienteB clienteBanco = new ClienteB("Carlos Fumeta",'m');
        Cuenta cuentita = new Cuenta(10000,clienteBanco);

        System.out.println(clienteBanco);
        System.out.println(cuentita);

        cuentita.depositar(5000);
        System.out.println(cuentita.getBalance());
        cuentita.extraccion(17000);
        System.out.println(cuentita.getBalance());









    }
}
