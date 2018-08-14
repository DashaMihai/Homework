
public class Label implements Comparable<Object> {
	String name;

	public Label(String name) {
		this.name = name;
	}

	public String StringLabel() {
		return name;
	}

	@Override
	public int compareTo(Object obj) {
		Label objectToCompare = (Label) obj;
		int result = name.compareTo(objectToCompare.name);
		if (result != 0) {
			return result / Math.abs(result);
		}
		return 0;
	}

}
