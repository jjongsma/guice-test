package test;

import javax.inject.Inject;
import javax.inject.Named;

import com.barchart.util.guice.Component;

@Component("com.barchart.test.guice-app")
public class MyComponent {

	@Inject
	@Named("#name")
	public String name;

}
