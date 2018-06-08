import java.util.HashMap;

public class NonRepeating {

	public static void main(String[] args) {
		System.out.println(repeating("aabcb"));
		System.out.println(repeating("aabcbc"));
		System.out.println(repeating("abcb"));

	}

	static Character repeating(String s) {

		HashMap<Character, Integer> char_count = new HashMap<>();
		for (char i : s.toCharArray()) {
			if (char_count.containsKey(i)) {
				Integer count = char_count.get(i) + 1;
				char_count.put(i, count);
			} else
				char_count.put(i, 1);
		}

		for (char i : s.toCharArray()) {
			if (char_count.get(i) == 1)
				return i;
		}
		return null;
	}
}