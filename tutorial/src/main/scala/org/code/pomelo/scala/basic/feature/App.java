package scala.org.code.pomelo.scala.basic.feature;

import scala.collection.JavaConverters;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 2017/5/10.
 *
 * Combine Scala and Java seamlessly.
 * Use JavaConverters to convert between scala collections and java collections.
 *
 */
public class App {

    public void distinctPerson(List<Person> people){
        List<Person> minors = new ArrayList<>(people.size());
        List<Person> adults = new ArrayList<>(people.size());
        for (Person person : people){
            /*if (person.getAge() < 18)
                minors.add(person);
            else
                adults.add(person);*/
        }
    }

    public List<Author> loadAuthorsFromFile(File file){
        //return new ArrayList<Author>(JavaConversions.asJavaCollection(Author.loadAuthorsFromFile(file)));
        return new ArrayList<>(JavaConverters.asJavaCollection(Author.loadAuthorsFromFile(file)));
    }

    public void sortAuthors(List<Author> authors){
        Collections.sort(authors);
    }

    public void displaySortedAuthors(File file){
        List<Author> authors = loadAuthorsFromFile(file);
        sortAuthors(authors);
        for (Author author : authors)
            System.out.println(author.lastName() + "," + author.firstName());
    }
}
