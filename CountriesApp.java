import java.util.ArrayList;
import java.util.Scanner;

public class CountriesApp extends CountriesTextFile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInput = 0;

//		ArrayList<Country> countries = new ArrayList<>();
//		countries.add(new Country("India", 1300000000));
//		countries.add(new Country("Brazil", 209000000));
//		countries.add(new Country("Palestine", 4800000));
//		countries.add(new Country("U.S.A", 327000000));
		createDir();
		createOurFile();

		while (userInput != 3) {
			System.out.println("Press \"1\" to Display list of Countries & their populations.");
			System.out.println("Press \"2\" to add a country's population to the list.");
			System.out.println("Press \"3\" to exit program");
			userInput = scan.nextInt();

			switch (userInput) {

			case 1:
				readFromFile();
			case 2:
				String country;
				int population;
				System.out.println("Country: ");
				country = scan.nextLine();
				System.out.println("Population: ");
				population = scan.nextInt();
				writeToFile(country, population);
				

			}

		}

	}

}
