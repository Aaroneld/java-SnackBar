package JavaSnackBar;

import java.util.Random;
import java.text.DecimalFormat;

public class Customer
{

    private int maxId;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand)
    {
        Random rand = new Random();

        this.name = name;
        this.cashOnHand = Math.round((cashOnHand * 100) / 100);
        this.id = rand.nextInt(100000);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return this.id;
    }

    public void addCash(double cash)
    {

        this.cashOnHand += Math.round((cash * 100) / 100);
    }

    public double getCash()
    {
        return this.cashOnHand;
    }

    public String buySnack(double cost)
    {
        if(cost == (double) 0)
        {
            return String.format("%s cash on hand %.2f, purchase not made not enough of snack", this.getName(), this.cashOnHand);
        } else {

            this.cashOnHand -= Math.round((cost * 100) / 100);

            return String.format("%s cash on hand %.2f", this.getName(), this.cashOnHand);
        }

    }
}