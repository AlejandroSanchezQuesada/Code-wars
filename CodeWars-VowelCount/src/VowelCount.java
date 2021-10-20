public class VowelCount {

	public static void main(String[] args) {
		int vowelsCount = 0;
		String str = "Hola que tal";
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < str.length(); i++) {
			for (int vocal = 0; vocal < vowels.length; vocal++) {
				if (str.charAt(i) == vowels[vocal]) {
					vowelsCount++;
				}
			}
		}

		System.out.println("El total de vocales es " + vowelsCount);

	}

}
