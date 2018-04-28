package org.columbia.service;

import edu.stanford.nlp.ling.IndexedWord;
import org.columbia.entity.PartOfSpeech;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class PartOfSpeechBuilderImpl implements PartOfSpeechBuilder {

    private PartOfSpeech pos;

    public PartOfSpeechBuilderImpl() {
        pos = new PartOfSpeech();
    }

    @Override
    public PartOfSpeech build() {
        return pos;
    }

    @Override
    public PartOfSpeechBuilder setSentence(String sentence) {
        pos.setSentence(sentence);
        return this;
    }

    @Override
    public PartOfSpeechBuilder setArticles(List<IndexedWord> articles) {
        pos.setArticles(streamIndexedWords(articles));
        return this;
    }

    @Override
    public PartOfSpeechBuilder setPrepositions(List<IndexedWord> prepositions) {
        pos.setPrepositions(streamIndexedWords(prepositions));
        return this;
    }

    @Override
    public PartOfSpeechBuilder setVerbs(List<IndexedWord> verbs) {
        pos.setVerbs(streamIndexedWords(verbs));
        return this;
    }

    @Override
    public PartOfSpeechBuilder setNouns(List<IndexedWord> nouns) {
        pos.setNouns(streamIndexedWords(nouns));
        return this;
    }

    @Override
    public PartOfSpeechBuilder setAdjectives(List<IndexedWord> adjectives) {
        pos.setAdjectives(streamIndexedWords(adjectives));
        return this;
    }

    private List<String> streamIndexedWords (List<IndexedWord> list) {
        /**
         * Ok so here's the thing ...
         *
         * We want to return a List<String> but Stanford NLP has us working with List<IndexedWords>
         * No biggie with a lambda!
         *
         * On top of that, the String tokens we are left with still include their POS labels!
         * Let's get rid of those with a REGEX inside the lambda ...
         */

        List<String> strings = list.stream()
                .map(object -> Objects.toString(object, null).replaceAll("/.*", ""))
                .collect(Collectors.toList());
        return strings;
    }
}
