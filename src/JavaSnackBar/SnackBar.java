package JavaSnackBar;



public class SnackBar
{
    public static void main (String[] args)
    {
        Customer customer1 = new Customer("Aaron", 100.1);
        Customer customer2 = new Customer("Annabella", 255.25);

        Snack hersheys = new Snack("hersheys", 20, 1.25, 1);
        Snack resees = new Snack("resees", 23, 1.50, 2);
        Snack mAndMs = new Snack ("m&ms", 27, 2.15, 3);

        System.out.println(customer1.buySnack(hersheys.buySnack(3)));
        System.out.println(String.format("Quantity of hersheys is %d", hersheys.getQuantity()));
        System.out.println();

        System.out.println(customer2.buySnack(resees.buySnack(20)));
        System.out.println(String.format("Quantity of reeses is %d", resees.getQuantity()));
        System.out.println();

        System.out.println(customer1.buySnack(mAndMs.buySnack(10)));
        System.out.println(String.format("Quantity of m&ms is %d", mAndMs.getQuantity()));
        System.out.println();
    }
}