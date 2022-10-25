public class Checking extends Account
{
    Checking(float b)
    {
        setAccount_balance(b);
    }

    @Override
    public void withdraw(float w)
    {
        if ((getAccount_balance() - w) < 0.0f)
        {
            System.out.println("Charging an overdraft fee of $20 because account is below $0.");
            setAccount_balance(getAccount_balance() - (w+20.0f));
        }
        else
        {
            setAccount_balance(getAccount_balance() - w);
        }
    }
}
