package org.columbia.service;

import edu.stanford.nlp.ling.IndexedWord;
import org.columbia.entity.PartOfSpeech;

import java.util.List;

interface PartOfSpeechBuilder {
    PartOfSpeech build();
    PartOfSpeechBuilder setSentence(final String sentence);
    PartOfSpeechBuilder setArticles(final List<IndexedWord> articles);
    PartOfSpeechBuilder setPrepositions(final List<IndexedWord> prepositions);
    PartOfSpeechBuilder setVerbs(final List<IndexedWord> verbs);
    PartOfSpeechBuilder setNouns(final List<IndexedWord> nouns);
    PartOfSpeechBuilder setAdjectives(final List<IndexedWord> adjectives);
}

