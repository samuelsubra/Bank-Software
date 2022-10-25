public class Savings extends Account
{
    int numDeposits = 0;
    float numInterest = 0.0f;

    Savings(float b)
    {
        setAccount_balance(b);
    }

    @Override
    public void withdraw(float w)
    {
        if ( (getAccount_balance() - w) < 500.0f )
        {
            System.out.println("Charging a fee of $10 because you are below $500.");
            setAccount_balance(getAccount_balance() - (w + 10.0f));
        }
        else
        {
            setAccount_balance(getAccount_balance() - w);
        }
    }

    @Override
    public void deposit(float d)
    {
        numDeposits++;
        System.out.println("This is deposit " + numDeposits + " to this account.");
        if (numDeposits > 5)
        {
            System.out.println("Charging a fee of $10.");
            setAccount_balance(getAccount_balance() + d - 10.0f);
        }
        else
        {
            super.deposit(d);
        }
    }

    public float interest()
    {
        numInterest = getAccount_balance() * 0.015f;
        setAccount_balance(getAccount_balance() + numInterest);
        return numInterest;
    }
}