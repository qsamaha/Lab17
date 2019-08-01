import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CountriesTextFile {
	public static void main(String[] args) {
		createDir();
		createOurFile();
		
	}


	public static void createDir() {
		String dirPath = "Countries";

		Path folder = Paths.get(dirPath);

		if (Files.notExists(folder)) {

			try {
				Files.createDirectories(folder);
				

			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("Something went wrong with that file creation!");
			}
		}
	}

	public static void createOurFile() {
		String fileName = "Countries.txt";

		Path path = Paths.get("Countries", fileName);
		if (Files.notExists(path)) {
			try {
				Files.createFile(path);
				
			} catch (IOException e) {

				System.out.println("Something went Wrong");
			}
		} 
	}

	public static void writeToFile(String country, int population) {
		
		String fileName = "Countries.txt";

		Path path = Paths.get("Countries", fileName);
		File file = path.toFile();
		PrintWriter output = null;

		ArrayList<Country> countries = new ArrayList<>();
		countries.add(new Country("India", 1300000000));
		countries.add(new Country("Brazil", 209000000));
		countries.add(new Country("Palestine", 4800000));
		countries.add(new Country("U.S.A", 327000000));
		
		
		Country a = new Country(country, population);
		countries.add(a);
		
		try {
			output = new PrintWriter(new FileOutputStream(file, true));
			for (Country t : countries) {
				output.println(t);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Call Customer Service!");
		} finally {
			output.close();
		}
	}

	public static void readFromFile() {
		 String fileName = "Countries.txt";
		 Path path = Paths.get("Countries", fileName);
		 
		 File file = path.toFile();
		 
		 
		 try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
				
			}
			br.close();	

		 } catch (FileNotFoundException e) {
			
			System.out.println("Something happened with the file");
		}catch (IOException e) {
			System.out.println("Something happened when attempting to read from a file");
		}
		 
	}	 
	}
