public class Account
{
    private static int counter = 10001;
    private int account_number;
    private float account_balance;

    Account()
    {
        account_number = counter;
        counter++;
        account_balance = 0.0f;
    }

    Account(float b)
    {
        account_number = counter;
        counter++;
        account_balance = b;
    }

    public int getAccount_number()
    {
        return this.account_number;
    }

    public float getAccount_balance()
    {
        return this.account_balance;
    }

    public void setAccount_balance(float account_balance)
    {
        this.account_balance = account_balance;
    }

    public void withdraw(float w)
    {
        this.account_balance = this.account_balance - w;
    }

    public void deposit(float d)
    {
        this.account_balance = this.account_balance + d;
    }
}
