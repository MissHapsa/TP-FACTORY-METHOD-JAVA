package org.example.Documents;

import org.example.Document;

public class CV implements Document {
    @Override
    public void read() {
        System.out.println("CV en cours de lecture");
    }
}