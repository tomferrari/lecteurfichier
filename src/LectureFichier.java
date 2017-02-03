import java.io.*;
import java.util.*;

/**
 *
 * @author licence
 */
public class LectureFichier {
    private File file;
    FileInputStream fichier;
    private LinkedList<String> contenu;
        
        public LectureFichier(String nom)
	{
		this.fichier = null;
		this.file = new File(nom);
		this.contenu = new LinkedList<String>();
	}
        
        public void ouvrir()
	{
		try {			
			this.fichier = new FileInputStream(this.file);
                        InputStreamReader reader = new InputStreamReader(this.fichier);
			BufferedReader buff = new BufferedReader(reader);
			String ligne;
			while((ligne = buff.readLine()) != null) {
				this.getContenu().add(ligne);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
        
        public void afficher()
	{		
		for(int i = 0; i < this.getContenu().size(); i++) {
			System.out.println(this.getContenu().get(i));
		}
	}
        
        public LinkedList<String> getContenu() {
		return contenu;
	}

	
	
    
}