import org.junit.*;

import static org.junit.Assert.assertTrue;

import java.io.*;

public class PaymentTypesJunit {

    private PaymentProcessor processor;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testCreditCardPayment() {
        processor = new PaymentProcessor(new CreditCardPayment());
        processor.processPayment(100.0);

        assertTrue(outContent.toString().contains("Paid 100.0 via Credit Card."));
    }

    @Test
    public void testDebitCardPayment() {
        processor = new PaymentProcessor(new DebitCardPayment());
        processor.processPayment(75.0);

        assertTrue(outContent.toString().contains("Paid 75.0 via Debit Card."));
    }

    @Test
    public void testMobilePayment() {
        processor = new PaymentProcessor(new MobilePayment());
        processor.processPayment(60.0);

        assertTrue(outContent.toString().contains("Paid 60.0 via Mobile Payment."));
    }

    @Test
    public void testChangePaymentStrategyAtRuntime() {
        processor = new PaymentProcessor(new CreditCardPayment());
        processor.processPayment(50.0);

        processor.setPaymentStrategy(new DebitCardPayment());
        processor.processPayment(25.0);

        String output = outContent.toString();
        assertTrue(output.contains("Paid 50.0 via Credit Card."));
        assertTrue(output.contains("Paid 25.0 via Debit Card."));
    }
}
