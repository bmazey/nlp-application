package org.columbia.entity;

import java.util.List;

public class PartOfSpeech {

    private String sentence;

    //TODO add Optional<?>
    private List<String> articles;
    private List<String> prepositions;
    private List<String> nouns;
    private List<String> verbs;
    private List<String> adjectives;

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public List<String> getNouns() {
        return nouns;
    }

    public void setNouns(List<String> nouns) {
        this.nouns = nouns;
    }

    public List<String> getAdjectives() {
        return adjectives;
    }

    public void setAdjectives(List<String> adjectives) {
        this.adjectives = adjectives;
    }

    public List<String> getVerbs() {
        return verbs;
    }

    public void setVerbs(List<String> verbs) {
        this.verbs = verbs;
    }

    public List<String> getPrepositions() {

        return prepositions;
    }

    public void setPrepositions(List<String> prepositions) {
        this.prepositions = prepositions;
    }

    public List<String> getArticles() {

        return articles;
    }

    public void setArticles(List<String> articles) {
        this.articles = articles;
    }

}
