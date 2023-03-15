package lecture06.task19;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static List<Poem> poemList = new ArrayList<>();

    public static void main(String[] args) {

        Poem poem = new Poem(9, new Author("Juku", "Estonian"));
        Poem poem1 = new Poem(4, new Author("Atis", "Latvian"));
        Poem poem2 = new Poem(5, new Author("Peter", "German"));

        poemList.add(poem);
        poemList.add(poem1);
        poemList.add(poem2);
        poemList.add(new Poem(15, new Author("John", "American")));
        poemList.add(new Poem(18,new Author("Juku","Estonina")));

        longestPoem();

    }

    private static void longestPoem() {
        Poem longest = Collections.max(poemList, Comparator.comparing(Poem::getStropheNumbers));
        System.out.println("Longest poem has " + longest.getCreator().getSurname());
    }
}

