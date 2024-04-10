package org.example.Creators;

import org.example.Document;
import org.example.Documents.Articles;


public class ArticlesCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        System.out.println("Article a bien été cré");
        return new Articles();
    }
}

