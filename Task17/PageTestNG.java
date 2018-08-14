package Home;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.AfterClass;

public class PageTestNG {
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Start");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Finish");
  }
  @Test
	public void testMasHashSet() {
		Label label1 = new Label("Yy");
		Label label2 = new Label("Ss");
		Label[] labels = { label1, label2 };
		Page page=new Page();
		assertNotSame(labels,page.MasHashSet(labels));		
	}
	@Test
	public void testLabel() {
		Label label1 = new Label("Yy");
		Label label2 = new Label("Ss");
		Page page = new Page();
		assertTrue(1==page.CompareLabel(label1, label2));
	}
		
	
	@Test(expectedExceptions=MyException.class)
	public void testFieldFirstException() throws MyException {
		Page page = new Page();
		LinkedList<Field> fields = new LinkedList<Field>();
		page.FirstField(fields);
	}
	@Test(expectedExceptions=MyException.class)
	public void testFieldLastException() throws MyException {
		Page page = new Page();
		LinkedList<Field> fields = new LinkedList<Field>();
		page.LastField(fields);
}
	@Test
	public void testTitle() {
		Page page = new Page();
		assertNull(page.title);
	}

	
	@Test
	public void testid() {
		Page page = new Page();
		assertNotNull(page.dropdowns);
	}

	
	@Test
	public void testFields() {
		Page page = new Page();
		assertEquals(new LinkedList<Field>(), page.fields);
	}	
	
	@Test
	public void testSame() {
		Label label1 = new Label("Yy");
		Label label2 = new Label("Ss");
		Label[] labels = { label1, label2 };
		ArrayList<Label> labels1 = new ArrayList<Label>();
		labels1.add(label1);
		labels1.add(label2);
		assertNotSame(labels, labels1);
	}
	@Test
	public void testButton() {
		Button button = new Button("X", "Push");
		ArrayList<Button> buttons = new ArrayList<Button>();
		buttons.add(button);
		assertTrue(buttons.contains(button));
	}

	@Test(expectedExceptions = MyException_2.class)
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
}