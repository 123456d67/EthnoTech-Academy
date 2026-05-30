interface Bank
{
    void deposit(int amount);
    void withdraw(int amount);
}
interface UPI
{
    void payUPI(int amount);
}
class Sbi implements Bank
{
    public void deposit(int amount)
    {
        System.out.println("Amount deposited to SBI: "+amount);
    }
    public void withdraw(int amount)
    {
        System.out.println("Amount withdrawn from SBI: "+amount);
    }
    public void payUPI(int amount)
    {
        System.out.println("Amount paid using UPI: "+amount);
    }
}
class Interface
{
    public static void main(String args[])
    {
        Sbi s=new Sbi();
        s.deposit(50000);
        s.withdraw(20000);
        s.payUPI(10000);
    }
}
