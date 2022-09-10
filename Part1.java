
public class Part1 {

	public static int maxProduct(Array a, int m) {
		int temp = 1;
		int max = 0;
		int start = 0;
		for (int i = 0;i<m;i++) {
			if (a.getVal(i) != 0) {
				temp = temp*a.getVal(i);
			} else {
				temp = 1;
				start = i;
			}
		}
		if (start == 0) 
			max = temp;
		for (int i = start;i<(a.length()-m);i++) {
			if (a.getVal(i) != 0) {
			temp = temp/a.getVal(i)*a.getVal(i+m);
				if (temp > max) {
					max = temp;
				}
			} else {
				int num = 1;
				for (int j = i+1;j<i+m+1;j++) {
					num = num*a.getVal(j);
				}
				temp = num;
				if (temp > max) {
					max = temp;
				}
			}
		}
		return max;
	}
}