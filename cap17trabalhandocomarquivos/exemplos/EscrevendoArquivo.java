package exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoArquivo {

	public static void main(String[] args) {

		String[] lines = new String[] {"Good morning","Good afternoon","Good night"};
		
		String path = "C:\\Users\\dogz3\\Documents\\EclipseProjects\\out.txt";
//TRUE RECRIA , SEM O ",TRUE" ELE RECRIA
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			for(String line:lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

}
