package exemplos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivoScanner {

	public static void main(String[] args) {
		//Instancia um objeto do tipo file para acessar arquivos
				File file = new File("C:\\Users\\dogz3\\Documents\\EclipseProjects\\in.txt");
				Scanner sc = null;
				
				try {
					sc = new Scanner(file);
					
					while(sc.hasNextLine()) {
						System.out.println(sc.nextLine());
					}
				}
				
				catch(IOException e) {
					System.out.println("Error: "+ e.getMessage());
				}
				
				finally {
					if(sc != null)
						sc.close();
				}

	}
}	
