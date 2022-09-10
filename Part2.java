
public class Part2 {

	public static void pushZeroes(Array a) {
		int x;
		int back = a.length()-1;
		for (int i = 0;i<a.length()-1;i++) {
			if (a.getVal(i) == 0) {
				x = i;
				while (x<back) {
					if (a.getVal(x+1) != 0) {
						a.swap(x,x+1);
					}
					x += 1;
					if (x == back) {
						i -= 1;
						back -= 1;
					}
				}
			}
		}
	}
}
