import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class testAccount {

    @Test
    public void testThatgetBalance() {
        Account account = new Account();
        account.getBalance();
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    public void testThatDeposite() {
        Account account = new Account();
        account.deposit(100);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testThatWithdraw() {
        Account account = new Account();
        account.withdraw(100);
        account.deposit(100);
        assertEquals(100.0, account.getBalance(), 0.001);
    }
}