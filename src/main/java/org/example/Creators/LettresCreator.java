package org.example.Creators;

import org.example.Document;
import org.example.Documents.Lettres;

// Sous-classe concrète du créateur pour créer des lettres
public class LettresCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        System.out.println("Lettre a bien été crée");
        return new Lettres();
    }
}
