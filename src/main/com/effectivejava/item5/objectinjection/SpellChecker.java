package main.com.effectivejava.item5.objectinjection;

import java.util.List;
import java.util.Objects;

public class SpellChecker {
    private  final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }


    public  boolean isValid(String word) {
        return false;
    }

    public  List<String> suggestions(String type){
        return List.of();
    }
}
