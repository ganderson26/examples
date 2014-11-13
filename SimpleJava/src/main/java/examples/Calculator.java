package examples;
// comments
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Calculator
 * 
 * @author Glenn
 *
 */
public class Calculator {
	
	private static final Logger logger = Logger.getLogger(Calculator.class);

	/**
	 * Constructor
	 */
	protected Calculator() {
		super();
	}

	/**
	 * Returns the sum of the 2 operands.
	 * 
	 * @param a First argument
	 * @param b Second argument
	 * @return Sum of a + b
	 */
	public int sum(final int firstArg, final int secondArg) {
		//System.out.println("Calculator.sum()");
		
		logger.info("Calculator.sum()");
		return firstArg + secondArg;
	}
	
	public static void main(String[] args) {
		//BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
				
		Calculator calculator = new Calculator();
		int answer = calculator.sum(44, 42);
		
		logger.info("answer=" + answer);
	}

}
