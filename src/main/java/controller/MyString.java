package controller;

public class MyString {
	private String stroka;
	

	public MyString(String stroka) {
		super();
		this.stroka = stroka;
	}

	public String getStroka() {
		return stroka;
	}

	public void setStroka(String stroka) {
		this.stroka = stroka;
	}

	@Override
	public String toString() {
		return "MyString [stroka=" + stroka + "]";
	}
	

}
