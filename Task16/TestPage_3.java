package home14;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import org.hamcrest.Matcher;
import org.junit.Test;

public class TestPage_3 {
	
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
	public void testId() {
		HashSet<Label> label = new HashSet<Label>();
		Label label1 = new Label("Yy");
		Label label2 = new Label("Ss");
		Page page = new Page();
		assertThat(1, is(page.CompareLabel(label1, label2)));
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
}
