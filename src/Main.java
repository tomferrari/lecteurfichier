/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LectureFichier lecture = new LectureFichier("/Users/Thomas/Desktop/test.rtf");
        Palindrome palindrome = new Palindrome("/Users/Thomas/Desktop/test.rtf");
        lecture.ouvrir();
        lecture.afficher();
        
        palindrome.ouvrir();
        palindrome.afficher();

    }
    
}
