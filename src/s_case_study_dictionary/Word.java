package s_case_study_dictionary;

import java.io.Serializable;

public class Word implements Serializable {
    private String keyword;
    private String pronunciation;
    private String noun;
    private String adjective;
    private String verb;
    private String synonymous;

    public Word() {
    }

    public Word(String word, String pronunciation, String noun, String adjective, String verb, String synonymous) {
        this.keyword = word;
        this.pronunciation = pronunciation;
        this.noun = noun;
        this.adjective = adjective;
        this.verb = verb;
        this.synonymous = synonymous;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getSynonymous() {
        return synonymous;
    }

    public void setSynonymous(String synonymous) {
        this.synonymous = synonymous;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + keyword + '\'' +
                ", pronunciation='" + pronunciation + '\'' +
                ", noun='" + noun + '\'' +
                ", adjective='" + adjective + '\'' +
                ", verb='" + verb + '\'' +
                ", synonymous='" + synonymous + '\'' +
                '}';
    }
}
