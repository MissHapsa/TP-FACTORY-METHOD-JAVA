package org.example;

import org.example.Creators.ArticlesCreator;
import org.example.Creators.CvCreator;
import org.example.Creators.DocumentCreator;
import org.example.Creators.LettresCreator;

// Classe principale contenant le point d'entrée du programme
public class Main {
    public static void main(String[] args) {
        // Création d'une instance de chaque type de document
        DocumentCreator[] creators = {new LettresCreator  (), new CvCreator(), new ArticlesCreator()};
        for (DocumentCreator creator : creators) {
            Document document = creator.createDocument();
            document.read();
        }
    }
}
