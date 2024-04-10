package org.example.Creators;


import org.example.Document;
import org.example.Documents.CV;

// Sous-classe concrète du créateur pour créer des lettres
    public class CvCreator extends DocumentCreator {
        @Override
        public Document createDocument() {
            System.out.println("CV a bien été cré");
            return new CV();
        }
    }

