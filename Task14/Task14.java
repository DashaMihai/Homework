import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Collection;

public class Task14 {

	public static void main(String[] args) {

		// �������� ���� ��������, �� ������������� � ������ ������� ��������������� �
		// ������ main.
		Button button = new Button("X", "Push");
		ArrayList<Button> buttons = new ArrayList<Button>();
		buttons.add(button);

		Field field1 = new Field(1, 22);
		Field field2 = new Field(2, 33);
		Field field3 = new Field(3, 44);
		LinkedList<Field> fields = new LinkedList<Field>();
		fields.add(field1);
		fields.add(field2);
		fields.add(field3);

		HashSet<Label> label = new HashSet<Label>();
		Label label1 = new Label("Yy");
		Label label2 = new Label("Ss");
		Label[] labels = { label1, label2 };
		ArrayList<Label> labels1 = new ArrayList<Label>();
		labels1.add(label1);
		labels1.add(label2);

		List<String> options = new ArrayList();
		options.add("Zzz");
		Dropdown dropdown1 = new Dropdown(options, true, "W");
		TreeSet<Dropdown> dropdowns = new TreeSet<Dropdown>();
		dropdowns.add(dropdown1);
		ArrayList<Dropdown> dropdowns1 = new ArrayList();
		dropdowns1.add(dropdown1);
		Page page = new Page(buttons, fields, label, dropdowns, 2.5f, "Title");

		// 1. ��������, ���������� �� ������ � ������. ���������� boolean
		System.out.println(page.ExistenceButton(button));

		// 2. ������� ������ ������� field, ���� ��� ��� - ��������� ����������
		try {
			System.out.println(page.FirstField(fields).StringField());
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

		// 3. ������� ��������� ������� field, ���� ��� ��� - ��������� ����������
		try {
			System.out.println(page.LastField(fields).StringField());
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

		// 4. ��������� ������ labels, ������ � HashSet ������ � ����������
		// HashSet<Label>
		page.MasHashSet(labels).stream().forEach(lab -> System.out.println(lab.StringLabel()));

		// 5. ��������� ������ ArrayList<Label>, ������ ��� � TreeSet<Dropdowns>. ����
		// ��� ���������� - ��������� ����������� ����������.
		try {
			page.ListChange(labels1).stream().forEach(lab -> System.out.println(lab.StringDropdown()));
		} catch (MyException_1 e) {
			System.out.println(e.getMessage());

		}

		// 6. ��������� 2 ������� label, ��������� ���������������� compareTo ����������
		// ��������� ��������� (-1, 0, 1).
		System.out.println(page.CompareLabel(label1, label2));

		// 7. �����, ������� ������� �� ����� 3-� ������� Dropdowns � ������
		// LinkedHashSet <Dropdowns>, ���� ��� ��� - ��������� ����������� ����������.
		try {
			page.InfoDropdowns(dropdowns1).stream().forEach(drop -> System.out.println(drop.StringDropdown()));
		} catch (MyException_2 e) {
			System.out.println(e.getMessage());

		}

	}

}
