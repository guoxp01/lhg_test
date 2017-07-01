package lxh;

public class Substitute {

	public int getValue(String key, String code) {
		String result = "";
		char[] keys = key.toCharArray();
		char[] codes = code.toCharArray();
		for (int i = 0; i < codes.length; i++) {
			int index = 1;
			for (int j = 0; j < keys.length; j++) {
				if (codes[i] == keys[j]) {
					if (index == 10)
						result += 0;
					else
						result += index;
				}
				index++;
			}
		}

		return Integer.valueOf(result);
	}
}
