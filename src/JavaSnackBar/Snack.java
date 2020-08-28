package JavaSnackBar;

import java.util.Random;

public class Snack
{
    private int maxId;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;


    public Snack(String name, int quantity, double cost, int VMID){

        Random rand = new Random();

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = VMID;
        this.id = rand.nextInt(10000);
    }

    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCost()
    {
        return this.cost;
    }

    public void setCost(float cost)
    {
        this.cost = cost;
    }

    public int getVMID()
    {
        return this.vendingMachineId;
    }

    public void setVMID(int VMID)
    {
        this.vendingMachineId = VMID;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public void addToQuantity(int addition)
    {
        this.quantity += addition;
    }

    public double buySnack(int amount)
    {
        if(amount > this.quantity){
            return 0;
        } else {
            this.quantity -= amount;
            return amount * this.cost;
        }
    }

    public double getTotal(int amount){
        return amount * this.cost;
    }


}

