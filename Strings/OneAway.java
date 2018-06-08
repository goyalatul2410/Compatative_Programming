
public class OneAway {

	public static void main(String[] args) {

		System.out.println(away("abcde", "abfde"));
		System.out.println(away("abcde", "abde"));
		System.out.println(away("abde", "abede"));
		System.out.println(away("aaa", "abc"));
		System.out.println(away("abcde", "abc"));
	}

	static Boolean away(String s1, String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		int n = n1 - n2;

		if (n == 0)
			return away1(s1, s2);
		else if (n == 1)
			return away2(s1, s2);
		else if (n == -1)
			return away2(s2, s1);
		else
			return false;

	}

	static Boolean away1(String s1, String s2) {

		int count = 0;
		for (int i = 0; i < s1.toCharArray().length; i++) {
			if (s1.charAt(i) == s2.charAt(i))
				continue;
			else
				count++;
		}
		if (count == 1 || count == 0)
			return true;
		else
			return false;

	}

	static Boolean away2(String s1, String s2) {

		int count = 0;
		int p1 = 0, p2 = 0;
		while (p1 < s1.length() && p2 < s2.length()) {
			if (s1.charAt(p1 + count) == s2.charAt(p2)) {
				p1++;
				p2++;
			} else {
				count++;
			}
		}
		if (count == 1)
			return true;
		else
			return false;
	}
}
