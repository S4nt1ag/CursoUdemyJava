public class ExercecioDeFixacao1 {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'f';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.println(product1 + ", which price is $ " + price1);
		System.out.println(product2 + ", which price is $ " + price2);
		System.out.println();
		System.out.println();
		System.out.printf("Record: %d years old, code %d 5290 and gender: %c", age, code, gender);
		System.out.println();
		System.out.println();
		System.out.println("Measure eight decimal places: " + measure);
		System.out.printf("Measure (three decimal places): %.3f", measure);

	}

}