class Bank
{
    private int BankBalance;
    public void setBalance(int Balance)
    {
        this.BankBalance=Balance;
    }
    
    public int getBalance(){
        return BankBalance;
    }
    public static void main(String[] args){
    Bank b1=new Bank();
    b1.setBalance(50000);
    System.out.print("The Balance in your Account is :");
    System.out.println(b1.getBalance());
    }
}