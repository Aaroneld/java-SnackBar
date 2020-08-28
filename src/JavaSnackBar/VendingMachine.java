package JavaSnackBar;

import java.util.Random;

public class VendingMachine
{
    private int maxId;
    private int id;
    private String name;

    public VendingMachine(String name)
    {
        Random rand = new Random();
        this.id = rand.nextInt(100000);
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


}