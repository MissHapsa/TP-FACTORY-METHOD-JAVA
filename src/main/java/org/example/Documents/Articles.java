package org.example.Documents;

import org.example.Document;

// Sous-classe concrète de documents représentant un article
public class Articles implements Document {
    @Override
    public void read() {
        //afficher une message dans la console
        System.out.println("Article en cours de Lecture");
    }
}
