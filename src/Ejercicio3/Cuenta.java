package Ejercicio3;

import java.util.UUID;

public class Cuenta {

    private UUID id;
    private double balance;
    private ClienteB cliente;

    public Cuenta()
    {

    }

    public Cuenta(double balance,ClienteB cliente)
    {
        this.id=UUID.randomUUID();
        this.balance=balance;
        this.cliente=cliente;
    }

    public UUID getId()
    {
        return id;
    }

    public void setBalance(double balance)
    {
        this.balance=balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setCliente(ClienteB cliente)
    {
        this.cliente=cliente;
    }

    public ClienteB getCliente()
    {
        return cliente;
    }


    @Override
    public String toString()
    {
        return "[Cuenta =  ID"+id+" Cliente : "+cliente+" Balance "+balance+"]";
    }

    public void depositar(double deposito)
    {
        setBalance(getBalance()+deposito);
    }

    public void extraccion(double extraer)
    {
        double aux=getBalance();
        if(extraer>aux+2000)
        {
            System.out.println("error,monto insuficiente");
        }else
        {
            setBalance(getBalance()-extraer);
        }
    }

}
