package bathe;

/**
 * author: Richard Vowles - http://gplus.to/Richard.Vowles
 */
public class SampleInitializer implements BatheInitializer {

	public static boolean value = false;

	@Override
	public int getOrder() {
		return 1;
	}

	@Override
	public String getName() {
		return "simple";
	}

	@Override
	public String[] initialize(String[] args, String jumpClass) {
		value = true;

		return args;
	}
}
