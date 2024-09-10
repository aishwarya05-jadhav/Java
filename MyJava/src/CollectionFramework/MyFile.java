package CollectionFramework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyFile {
	
	public void createFile() throws IOException {
		File newFile = new File("ListOfCourses.txt");
		if (newFile.createNewFile()) {
		System.out.println("File created.");
		} else {
		System.out.println("File exists.");
		}
	}
	
	public void readFile() {
		String filePath = "abc.txt"; // Specify the path to your .txt file
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Process each line here
                System.out.println(line); // Example: Print each line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	public static void main(String[] args) throws IOException {
		
		MyFile m = new MyFile();
		m.createFile();
		m.readFile();
		 

	}

}


