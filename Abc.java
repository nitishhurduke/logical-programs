public class Abc {
	public static void main(String args[]) {
		String[] a1 = { "abc", "efg", "zxc", "aaa" };
		String[] b1 = { "abf", "ade", "urv", "aaa" };
		int[] count = new int[a1.length];
		String[] common = new String[a1.length];

		int l = 0;

		System.out.println("a1  b1 common bool");
		for (int h = 0; h < a1.length; h++)// All strings in a1 and b1 array
		{
			common[h] = "";
			char[] com = common[h].toCharArray();
			boolean bool = false;

			for (int i = 0; i < 3; i++)// All letters from all Strings in a1 Array
			{
				for (int j = 0; j < 3; j++)// All letters from b1[h] String compared with each a1[h] letters separately
				{
					if (a1[h].charAt(i) == b1[h].charAt(j)) {
						if (com.length > 1) {
							for (int q = 0; q < common[h].length(); q++) {
								for (int p = 0; p < common[h].length(); p++) {
									if (bool == false) {
										if (com[q] == com[p]) {
											common[h] += a1[h].charAt(i);
											bool = true;
											l++;
										}
									}
								}
							}
						} else {
							common[h] += a1[h].charAt(i);

						}
						l++;
						count[h]++;
					}

				}
			}

			if (count[h] == 0) {
				System.out.println(a1[h] + " " + b1[h] + "     NO");
			} else {

				System.out.println(a1[h] + " " + b1[h] + " " + common[h] + "   Yes");
			}
			l = 0;
		}
	}
}
