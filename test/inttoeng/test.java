package inttoeng;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class test {

	@Test
	public void test0() {
		IntToEng1 ite1 = new IntToEng1();
		String expected = "zero";
		String actual = ite1.translateEng(0);
		assertThat(actual, is(expected));
	}
	@Test
	public void test15(){
		IntToEng1 ite1 = new IntToEng1();
		String expected = "fifteen";
		String actual = ite1.translateEng(15);
		assertThat(actual,is(expected));
	}
	@Test
	public void test2147483646() {
		IntToEng1 ite = new IntToEng1();
		String expected = "two billion one hundred and forty seven million four hundred and eighty three thousand six hundred and forty six";
		String actual = ite.translateEng(2147483646);
		assertThat(actual, is(expected));
	}
	@Test
	public void test2147483647() {
		IntToEng1 ite = new IntToEng1();
		String expected = "out of range!!";
		String actual = ite.translateEng(2147483647);
		assertThat(actual, is(expected));
	}
}
