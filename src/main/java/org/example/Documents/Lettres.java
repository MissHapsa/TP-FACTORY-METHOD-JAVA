package org.example.Documents;

import org.example.Document;

// Sous-classe concrète de documents représentant une lettre
public class Lettres implements Document {
    @Override
    public void read() {
        System.out.println("Lettre en cours de lecture");
    }
}

