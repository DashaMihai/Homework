package home14;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import org.junit.Ignore;
import org.junit.Test;

public class TestPage {

	@Test
	public void testButton() {
		Button button = new Button("X", "Push");
		ArrayList<Button> buttons = new ArrayList<Button>();
		buttons.add(button);
		assertTrue(buttons.contains(button));
	}

	@Test(expected = MyException_2.class)
	public void testException1() throws MyException_2 {
		List<String> options = new ArrayList();
		options.add("Zzz");
		Dropdown dropdown1 = new Dropdown(options, true, "W");
		ArrayList<Dropdown> dropdowns1 = new ArrayList();
		dropdowns1.add(dropdown1);
		Page page = new Page();
		page.InfoDropdowns(dropdowns1).stream().forEach(drop -> System.out.println(drop.StringDropdown()));
	}

	@Test
	public void testFieldFirst() throws MyException {
		Field field1 = new Field(1, 22);
		Field field2 = new Field(2, 33);
		Field field3 = new Field(3, 44);
		LinkedList<Field> fields = new LinkedList<Field>();
		fields.add(field1);
		fields.add(field2);
		fields.add(field3);
		Page page = new Page();
		assertEquals(field1, page.FirstField(fields));
	}

	@Test
	public void testFieldLast() throws MyException {
		Field field1 = new Field(1, 22);
		Field field2 = new Field(2, 33);
		Field field3 = new Field(3, 44);
		LinkedList<Field> fields = new LinkedList<Field>();
		fields.add(field1);
		fields.add(field2);
		fields.add(field3);
		Page page = new Page();
		assertEquals(field3, page.LastField(fields));
	}

	@Ignore
	@Test
	public void test() {

	}

}
