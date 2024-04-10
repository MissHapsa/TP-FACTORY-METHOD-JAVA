package org.example.Creators;

import org.example.Document;

// Classe abstraite du créateur (Factory Method)
public abstract class DocumentCreator {
    public Document createDocument() {
        return new Document() {
            @Override
            public void read() {

            }
        };
    }


}

