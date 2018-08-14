import java.util.List;

public class Dropdown implements Comparable<Object> {
	private List<String> options;
	private boolean isSelected;
	private String name;

	public Dropdown(List<String> options, boolean isSelected, String name) {
		this.options = options;
		this.isSelected = isSelected;
		this.name = name;
	}

	public String StringDropdown() {
		return options + " " + isSelected + " " + name;
	}

	@Override
	public int compareTo(Object obj) {
		Dropdown objectToCompare = (Dropdown) obj;
		int result = name.length() - objectToCompare.name.length();
		if (result != 0) {
			return result / Math.abs(result);
		}

		return 0;
	}

}
