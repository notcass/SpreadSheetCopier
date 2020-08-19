package main;

public class GitHubTest {
    private String name;
    private String words;



    public GitHubTest(String name, String words) {
        this.name = name;
        this.words = words;
    }

    void sayWords() {
        System.out.println(words);
    }
}
