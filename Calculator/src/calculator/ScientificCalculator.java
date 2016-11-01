package calculator;

import javax.swing.JFrame;

/**
 *
 * @author Samyu
 */
public class ScientificCalculator extends Calculator{ //Singleton
    private static ScientificCalculator Singleton = new ScientificCalculator();
    public ScientificCalculator() {
        super();
    }
    public static ScientificCalculator  getInstance() {
        return Singleton;        
    }
    
}
