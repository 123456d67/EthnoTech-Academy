abstract class Restaurant 
{
    abstract void orderFood(String item, int qty);

    void generateBill(double amount) 
    {
        System.out.println("Total Bill: Rs. " + amount);
    }
}

class PizzaHut extends Restaurant 
{
    void orderFood(String item, int qty) 
    {
        double price = 0;
        if (item.equalsIgnoreCase("Pizza")) 
        {
            price = 250;
        } 
        else if (item.equalsIgnoreCase("Pasta")) 
        {
            price = 180;
        } 
        else if (item.equalsIgnoreCase("Burger")) 
        {
            price = 120;
        } 
        else 
        {
            System.out.println("Item not available");
            return;
        }
        double total = price * qty;
        System.out.println(qty + " x " + item + " ordered from Pizza Hut");
        generateBill(total);
    }
}

class Dominos extends Restaurant 
{
    void orderFood(String item, int qty) 
    {
        double price = 0;
        if (item.equalsIgnoreCase("Pizza")) 
        {
            price = 300;
        } 
        else if (item.equalsIgnoreCase("Pasta")) 
        {
            price = 200;
        } 
        else if (item.equalsIgnoreCase("Burger")) 
        {
            price = 150;
        } 
        else 
        {
            System.out.println("Item not available at Dominos");
            return;
        }
        double total = price * qty;
        total = total * 0.9;
        System.out.println(qty + " x " + item + " ordered from Dominos");
        System.out.println("10% discount applied");
        generateBill(total);
    }
}
class Nighthub extends Restaurant
{
    void orderFood(String item, int qty)
    {
        double price = 0;
        if (item.equalsIgnoreCase("Pizza"))
        {
            price = 200;
        }
        else if (item.equalsIgnoreCase("Pasta"))
        {
            price = 150;
        }
        else if (item.equalsIgnoreCase("Burger"))
        {
            price = 100;
        }
        else
        {
            System.out.println("Item not available at Nighthub");
            return;
        }
        double total = price * qty;
        System.out.println(qty + " x " + item + " ordered from Nighthub");
        generateBill(total);
    }
}
class Food 
{
    public static void main(String[] args) 
    {
        Restaurant r1 = new PizzaHut();
        r1.orderFood("Burger", 2);
        Restaurant r2 = new Dominos();
        r2.orderFood("Pizza", 2);
        Restaurant r3 = new Nighthub();
        r3.orderFood("Pasta", 3);
        r3.orderFood("Burger", 2);
        r3.orderFood("Kingfisher", 10);
    }
}