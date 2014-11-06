import javax.inject.Inject;
import javax.inject.Named;

import com.barchart.util.guice.GuiceLauncher;

public class Test {

	@Inject
	@Named("guice-app")
	private MyComponent component;

	public void run() {
		System.out.println("name = " + component.name);
	}

	public static void main(final String[] args) throws Exception {
		final Test test = GuiceLauncher.configure(Test.class);
		test.run();
	}

}