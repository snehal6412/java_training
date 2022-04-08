public class CurrentAcc extends BankAccount {
@Override
public void deposit()
{
System.out.println("Depositing in current Account");
}

@Override
public void withdraw()
{
System.out.println("withdrawing from current Account");
}
}