package calculator;

/**
 *
 * @author Samyu
 */
public class CalculatorFactory {
    public static Calculator getCalculator(String type) {
        if(type.equals(Type.ORDINARY)) {
            return OrdinaryCalculator.getInstance();
        }
        else if (type.equals(Type.SCIENTIFIC)) {
            return ScientificCalculator.getInstance();
        }
        else
        {
            return null;
        }
    }
}
