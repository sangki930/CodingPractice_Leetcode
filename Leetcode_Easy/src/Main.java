
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aababbbzzz";
		String pattern = "^[a-z]*a[a-z]{2}a[a-z]{2}b[a-z]*$";
		System.out.println(str.matches(pattern));
	}

}
