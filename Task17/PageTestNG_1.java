package Home;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PageTestNG_1 {
	@DataProvider(name = "simpleDataProvider")
	public Iterator<Object[]> createSomeData()	
	{	
		Field field1 = new Field(1, 22);
		Field field2 = new Field(2, 33);
		Field field3 = new Field(3, 44);
		Field field4 = new Field(4, 55);
	
		return Arrays.asList(new Object[][] 
	{
	{ new LinkedList<Field>(Arrays.asList(field1, field2)) },
	{new LinkedList<Field>(Arrays.asList(field3, field4))},
	}).iterator();
	}
	@Test(dataProvider = "simpleDataProvider")
	public void testFields(LinkedList<Field> fields)
	{
		Field a = fields.get(0);
		Field b = fields.get(1);
		System.out.println(a.StringField() + ", " + b.StringField());
		Assert.assertNotEquals(a, b);
}
}