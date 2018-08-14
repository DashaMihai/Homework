import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Page {
	List<Button> buttons;
	LinkedList<Field> fields;
	HashSet<Label> labels;
	TreeSet<Dropdown> dropdowns;
	private float id;
	String title;

	// 3. ����� Page �������� ������ �����������, � ������� ����� ������
	// ������������� ������ ��������
	public Page() {
		this.buttons = new ArrayList<Button>();
		this.fields = new LinkedList<Field>();
		this.labels = new HashSet<Label>();
		this.dropdowns = new TreeSet<Dropdown>();
		this.id = 0;
		this.title = null;
	}

	// 4. ������������� ����� ������ ���������� ���������� ���� ����� �������������
	// �����������, ���� ����� set - ���� �� �����
	public Page(List<Button> buttons, LinkedList<Field> fields, HashSet<Label> labels, TreeSet<Dropdown> dropdowns,
			float id, String title) {
		this.buttons = buttons;
		this.fields = fields;
		this.labels = labels;
		this.dropdowns = dropdowns;
		this.id = id;
		this.title = title;
	}

	// 1. ��������, ���������� �� ������ � ������. ���������� boolean
	public boolean ExistenceButton(Button button) {
		return buttons.contains(button);
	}

	// 2. ������� ������ ������� field, ���� ��� ��� - ��������� ����������
	public Field FirstField(LinkedList<Field> fields) throws MyException {
		if (fields.size() == 0) {
			throw new MyException("��������� ������.");
		}
		return fields.getFirst();
	}

	// 3. ������� ��������� ������� field, ���� ��� ��� - ��������� ����������
	public Field LastField(LinkedList<Field> fields) throws MyException {
		if (fields.size() == 0) {
			throw new MyException("��������� ������.");
		}
		return fields.getLast();
	}

	// 4. ��������� ������ labels, ������ � HashSet ������ � ����������
	// HashSet<Label>
	public HashSet<Label> MasHashSet(Label[] labels) {
		HashSet<Label> lab = new HashSet<Label>(Arrays.asList(labels));
		return lab;
	}

	// 5. ��������� ������ ArrayList<Label>, ������ ��� � TreeSet<Dropdowns>. ����
	// ��� ���������� - ��������� ����������� ����������.

	public TreeSet<Dropdown> ListChange(ArrayList<Label> labels1) throws MyException_1 {
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < labels1.size(); i++) {
			a.addAll(Arrays.asList(labels1.get(i).StringLabel()));
		}
		Dropdown d = new Dropdown(a, true, "Jo");
		TreeSet<Dropdown> drops = new TreeSet<Dropdown>();
		drops.add(d);
		
		if (drops.size() == 0) {
			throw new MyException_1("������ ���� ��������.");
		}
		return drops;
	}

	// 6. ��������� 2 ������� label, ��������� ���������������� compareTo ����������
	// ��������� ��������� (-1, 0, 1).
	public int CompareLabel(Label label1, Label label2) {
		return label1.compareTo(label2);
	}

	// 7. �����, ������� ������� �� ����� 3-� ������� Dropdowns � ������
	// LinkedHashSet <Dropdowns>, ���� ��� ��� - ��������� ����������� ����������.
	public LinkedHashSet<Dropdown> InfoDropdowns(ArrayList<Dropdown> dropdowns1) throws MyException_2 {
		if (dropdowns1.size() < 3) {
			throw new MyException_2("��������� �� �������� 3-� �������.");
		}
		System.out.println(dropdowns1.get(3).StringDropdown());
		LinkedHashSet<Dropdown> drop = new LinkedHashSet<Dropdown>(dropdowns1);
		return drop;
	}
}
