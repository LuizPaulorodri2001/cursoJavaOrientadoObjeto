package exerciciofixacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class Program{
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String pathIn = "C:\\Users\\dogz3\\Documents\\EclipseProjects";
		
		try {//CRIA A PASTA
			if(new File(pathIn+"\\Out").mkdir()) 
				System.out.println("New folder created!");
			else if (new File(pathIn+"\\Out")!=null)
				System.out.println("Folder exist!");
		}
		
		catch(RuntimeException e) {
			System.out.println("Path not created! "+e.getMessage());
		}
		
		try {//CRIA ARQUIVO
			File newFile = new File(pathIn+"\\Out\\summary.txt");
			System.out.println("New file created/update!");
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))){//ESCREVE NO ARQUIVO
				
				try(BufferedReader br = new BufferedReader(new FileReader(pathIn+"\\summary.txt"))) {

					String[] vect = br.readLine().split(",");
						int cont=0;
						
						while(vect!=null) {
							Product product = new Product(vect[0],vect[1],vect[2]);
							bw.write(product.toString());
							bw.newLine();
							cont++;
							System.out.println("Product "+cont+" Inserted");
							vect = br.readLine().split(",");
						}		
				}	
				catch(IOException e) {
					System.out.println("error read summary! "+e.getMessage());
				}
			}
			catch(IOException e) {
				System.out.println("Error input file! "+e.getMessage());
			}
		}
		
		catch(NullPointerException e) {
			System.out.println("Summary Completed");
		}
		
		catch(RuntimeException e) {
			System.out.println("Error in creat folder: "+e.getMessage());
		}
	
	}	
}
