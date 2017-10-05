package neppo.java;

public class Java1 {
	public static void main(String[] args) throws Exception {
		int[] ints = {3,2,5};
		int sum = 10;
		System.out.println(subsetSumChecker(ints, sum));
	}

	private static boolean subsetSumChecker(int[] ints, int sum) throws Exception {
		if(ints == null) {
            throw new UnsupportedOperationException("Attention --> ints is null!");
        }else {
            int cont = 0;
            if(cont == sum) return true;

            for (int anInt : ints) {
                cont += anInt;
                if (cont == sum) {
                    return true;
                }
            }
            return false;
        }
	}
}
