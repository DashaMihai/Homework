package home14;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestPage_2 {

	private LinkedList<Field> fields;

	@Parameters
	public static Collection<Object[]> setOfParameters() {
		Field field1 = new Field(1, 22);
		Field field2 = new Field(2, 33);
		Field field3 = new Field(3, 44);
		Field field4 = new Field(4, 55);
		return Arrays.asList(new Object[][] { { new LinkedList<Field>(Arrays.asList(field1, field2)) },
				{ new LinkedList<Field>(Arrays.asList(field3, field4)) }, });
	}

	public TestPage_2(LinkedList<Field> fields) {
		this.fields = fields;
	}

	@Test
	public void testFields() {
		Field a = fields.get(0);
		Field b = fields.get(1);
		
		System.out.println(a.StringField() + ", " + b.StringField());

		Assert.assertNotEquals(a, b);
	}

}
