

public class ArrayIfOutOfIndex {
//Graceful termination
	public static void main(String[] args) {
		int[] ages = new int[3];
		try {
			ages[0] = 21;
			ages[1] = 22;
			ages[2] = 23;
			ages[3] = 26;
		} catch (ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		}
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
	}

}
