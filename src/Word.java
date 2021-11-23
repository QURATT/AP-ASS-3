
public class Word {
	public
		String word;
		int frequency;
		

	public Word() {
		// TODO Auto-generated constructor stub
	}
	
	public Word(String w, int f) {
		word= w;
		frequency= f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

}
