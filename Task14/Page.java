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

	// 3. Класс Page содержит пустой конструктор, в котором полям класса
	// присваиваются пустые значение
	public Page() {
		this.buttons = new ArrayList<Button>();
		this.fields = new LinkedList<Field>();
		this.labels = new HashSet<Label>();
		this.dropdowns = new TreeSet<Dropdown>();
		this.id = 0;
		this.title = null;
	}

	// 4. Инициализация полей класса значениями происходит либо через перегруженный
	// конструктор, либо через set - одно на выбор
	public Page(List<Button> buttons, LinkedList<Field> fields, HashSet<Label> labels, TreeSet<Dropdown> dropdowns,
			float id, String title) {
		this.buttons = buttons;
		this.fields = fields;
		this.labels = labels;
		this.dropdowns = dropdowns;
		this.id = id;
		this.title = title;
	}

	// 1. проверку, содержится ли кнопка в списке. возвращает boolean
	public boolean ExistenceButton(Button button) {
		return buttons.contains(button);
	}

	// 2. вернуть первый элемент field, если его нет - выбросить исключение
	public Field FirstField(LinkedList<Field> fields) throws MyException {
		if (fields.size() == 0) {
			throw new MyException("Коллекция пустая.");
		}
		return fields.getFirst();
	}

	// 3. вернуть последний элемент field, если его нет - выбросить исключение
	public Field LastField(LinkedList<Field> fields) throws MyException {
		if (fields.size() == 0) {
			throw new MyException("Коллекция пустая.");
		}
		return fields.getLast();
	}

	// 4. принимает массив labels, вносит в HashSet класса и возвращает
	// HashSet<Label>
	public HashSet<Label> MasHashSet(Label[] labels) {
		HashSet<Label> lab = new HashSet<Label>(Arrays.asList(labels));
		return lab;
	}

	// 5. Принимает список ArrayList<Label>, вносит его в TreeSet<Dropdowns>. Если
	// это невозможно - выбросить собственное исключение.

	public TreeSet<Dropdown> ListChange(ArrayList<Label> labels1) throws MyException_1 {
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < labels1.size(); i++) {
			a.addAll(Arrays.asList(labels1.get(i).StringLabel()));
		}
		Dropdown d = new Dropdown(a, true, "Jo");
		TreeSet<Dropdown> drops = new TreeSet<Dropdown>();
		drops.add(d);
		
		if (drops.size() == 0) {
			throw new MyException_1("Разные типы объектов.");
		}
		return drops;
	}

	// 6. принимает 2 объекта label, используя переопределенный compareTo возвращает
	// результат сравнения (-1, 0, 1).
	public int CompareLabel(Label label1, Label label2) {
		return label1.compareTo(label2);
	}

	// 7. метод, который выведет на экран 3-й элемент Dropdowns и вернет
	// LinkedHashSet <Dropdowns>, если его нет - выбросить собственное исключение.
	public LinkedHashSet<Dropdown> InfoDropdowns(ArrayList<Dropdown> dropdowns1) throws MyException_2 {
		if (dropdowns1.size() < 3) {
			throw new MyException_2("Коллекция не содержит 3-й элемент.");
		}
		System.out.println(dropdowns1.get(3).StringDropdown());
		LinkedHashSet<Dropdown> drop = new LinkedHashSet<Dropdown>(dropdowns1);
		return drop;
	}
}
