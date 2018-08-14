
public class Field {
	int id;
	int value;

	public Field(int id, int value) {
		this.id = id;
		this.value = value;

	}

	public String StringField() {
		return id + " " + value;
	}
}
