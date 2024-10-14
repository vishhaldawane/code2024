
public class TestName {
	public static void main(String[] args) {
		
		String str1="jack123";
		
		String str2="jill123";
		
		if(!MyString.test1(str1) && !MyString.test2(str2)) {
			System.out.println("1.Invalid "+str1);
		}
		else if(!MyString.test1(str2) && !MyString.test2(str1)) {
			System.out.println("2.Invalid "+str2);
		}
		else {
			System.out.println("3.both are InValid");
		}

	}
}
class MyString
{
	static boolean test1(String str) {
		System.out.println("test1 invoked...");
		return str.matches("[a-z A-Z]+");
	}
	static boolean test2(String str) {
		System.out.println("test2 invoked...");
		return str.matches("[a-z A-Z]+");
	}
}
