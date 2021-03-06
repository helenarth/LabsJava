package task1;

public class StringsModel {
	
	private String[] strings;
	

	public StringsModel(int n) {
		strings = new String[n];
	}

	public StringsModel(String[] strings) {
		this.strings = strings;
	}

	public void addString(int pos, String string){
		strings[pos] = string;
	}

	public String getString(int pos){
		return strings[pos];
	}

	public int count() {
		return strings.length;
	}

	public String getMaxLengthString() {
		int max = -1;
		int pos = -1;
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].length() > max) {
				max = strings[i].length();
				pos = i;
			}
		}
		return strings[pos];
	}
	
	public int getLongestLength(){
		return getMaxLengthString().length();
	}

	public String toString() {
		String sStrings = "";
		for (int i = 0; i < strings.length; i++) {
			sStrings += ((i != 0) ? "," : "") + "\"" + strings[i] + "\"";
		}
		return this.getClass().getName() + "[" + sStrings + "]";
	}

	public boolean equals(Object ob) {
		return (this == ob) || (ob instanceof StringsModel)
				&& equalsImp((StringsModel) ob);
	}

	private boolean equalsImp(StringsModel other) {
		if (this.count() != other.count()) {
			return false;
		}
		for (int i = 0; i < this.count(); i++) {
			if (!this.getString(i).equals(other.getString(i)))
				return false;
		}
		return true;
	}

}
