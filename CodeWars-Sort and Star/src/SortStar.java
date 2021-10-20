import java.util.Arrays;
import java.util.List;

public class SortStar {

	public static void main(String[] args) {
		String[] s = { "bitcoin", "take", "over", "the", "alejandrino", "world", "maybe", "who", "knows", "perhaps" };
		List<String> lista = Arrays.asList(s);
		String firstVal = lista.stream().sorted().findFirst().get();
		String starVal = "";

		for (int i = 0; i < firstVal.length() - 1; i++) {
			starVal += firstVal.charAt(i) + "***";
		}
		starVal += firstVal.charAt(firstVal.length() - 1);

		System.out.println(starVal);
	}

}
