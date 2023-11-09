import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class WithdrawCashStepDefinitions {
    private Account account;
    private int requestedAmount;
    private int dispensedAmount;

    @Given("I have a balance of ${int} in my account")
    public void iHaveABalanceOfInMyAccount(int initialBalance) {
        account = new AccountImpl(initialBalance);
    }

    @When("I request ${int}")
    public void iRequest(int amountToRequest) {
        requestedAmount = amountToRequest;
        dispensedAmount = account.withdraw(amountToRequest);
    }

    @Then("${int} should be dispensed")
    public void shouldBeDispensed(int expectedDispensedAmount) {
        assertEquals(expectedDispensedAmount, dispensedAmount);
    }
}
