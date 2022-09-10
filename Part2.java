
public class Part2 {

	public static void main(String[] args) {
		Array a = new Array(10);
		a.setVal(0, 1);
		a.setVal(1, 2);
		a.setVal(2, 3);
		a.setVal(3, 4);
		a.setVal(4, 5);
		a.setVal(5, 6);
		a.setVal(6, 7);
		a.setVal(7, 0);
		a.setVal(8, 0);
		a.setVal(9, 0);
		int x = a.getAccessCount();
		System.out.println("Array before = "+a.toString());
		pushZeroes(a);
		System.out.println("Array after  = "+a.toString());
		System.out.println(a.getAccessCount()-x);
	}
	
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
