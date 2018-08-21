package home14;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.LinkedList;

import org.junit.Ignore;
import org.junit.Test;

public class TestPage_1 {

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
		
	
	@Test(expected=MyException.class)
	public void testFieldFirstException() throws MyException {
		Page page = new Page();
		LinkedList<Field> fields = new LinkedList<Field>();
		page.FirstField(fields);
	}
	@Test(expected=MyException.class)
	public void testFieldLastException() throws MyException {
		Page page = new Page();
		LinkedList<Field> fields = new LinkedList<Field>();
		page.LastField(fields);
	}
	@Ignore
	@Test
	public void test() {
		
	}

}
