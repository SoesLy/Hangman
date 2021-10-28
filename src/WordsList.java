public class WordsList {

    private String csWords;

    public WordsList(String csWords) {
        this.csWords = csWords;
    }

    @Override
    public String toString() {
        return "WordsList{" +
                "csWords='" + csWords + '\'' +
                '}';
    }

    public String getCsWords() {
        return csWords;
    }
}


