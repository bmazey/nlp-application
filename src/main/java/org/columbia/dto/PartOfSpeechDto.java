package org.columbia.dto;


import java.util.List;

public class PartOfSpeechDto {

    private String sentence;

    //TODO - add Optional<?>
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
}
