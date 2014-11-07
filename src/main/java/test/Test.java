package test;

import javax.inject.Inject;
import javax.inject.Named;

import com.barchart.util.guice.Component;
import com.barchart.util.guice.GuiceLauncher;

@Component("com.barchart.test.guice-app")
public class Test {

	@Inject
	@Named("#text")
	public String text;

	public void run() {
		System.out.println("text = " + text);
	}

	public static void main(final String[] args) throws Exception {
		final Test test = GuiceLauncher.configure(Test.class);
		test.run();
	}

}
