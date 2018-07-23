
public abstract class Word extends Sentence {

	public abstract int scanNumber();

	static int n;

	protected Word() {
	}

	protected Word(int n) {
		this.n = n;

	}
}