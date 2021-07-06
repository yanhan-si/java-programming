package lesson2.reflection.customAnnotations;

public final class CalculatorTest implements UnitTest {

    private final Calculator calculator = new Calculator();

    @Override
    public void beforeEachTest() {
        calculator.registerOperation("+", (a, b) -> a + b);
        calculator.registerOperation("-", (a, b) -> a - b);
        calculator.registerOperation("/", (a, b) -> a / b);
        calculator.registerOperation("*", (a, b) -> a * b);
    }

    @Test
    public void testAddition() {
        assert calculator.calculate(1, "+", 1) == 2;
        System.out.println("test passed");
    }

    @Test
    public void testSubtraction() {
        assert calculator.calculate(45, "-", 43) == 2;
    }
}
