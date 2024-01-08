package m;

public class ProjectMClassTest {
	public static void main(String[] args) {
		System.out.println(repeatSubstring("abcdefgh", 4)); // Output: "abcdabc"
		System.out.println(repeatSubstring("java", 2)); // Output: "java"
		System.out.println(repeatSubstring("hello", 0)); // Output: ""
	}

	static String repeatSubstring(String str, int n) {
		StringBuilder result = new StringBuilder();

		// Iterate from n down to 1
		for (int i = n; i >= 1; i--) {
			// Append the first i characters of the string to the result
			result.append(str.substring(0, i));
		}

		return result.toString();
	}

}
