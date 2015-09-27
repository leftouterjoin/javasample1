package pkg1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EaterTest {
	@Test
	public void test_eat() {
		Eater e =  new Eater();
		assertThat(e.eat(), equalTo("mgmg!!!!!!!!!!!!!!!"));
	}
}
