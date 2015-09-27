package pkg1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GreeterTest {
	@Test
	public void test_hello() {
		Greeter g =  new Greeter();
		assertThat(g.hello(), equalTo("Hello world!!!!!!!!!!!!!!!!!!!!!"));
	}
}
