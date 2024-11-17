package collections;

import entities.Course;
import entities.Student;
import util.DataReader;

import java.util.*;

public class PlayingWithCollectionsSolution {

    public static void main(String[] args) {
       playWithLists();
       playWithSet();
       playWithMaps();
       searchTimes();
    }

    public static void playWithLists(){

        // Lav en LinkedList og en ArrayList med Student-objekter. Fyld dem op med objekter ved at kalde DataReader.fillWithStudents() med din liste

        List<Student> linkedlist = new LinkedList<>();
        List<Student> arraylist = new ArrayList<>();

        DataReader.fillWithStudents(linkedlist, 10);
        DataReader.fillWithStudents(arraylist, 10);

        // Tilføj et nyt Student-objekt objekt med metoden add() til hver af listerne.
        // Hvor i listerne tror du, det bliver tilføjet? Test din teori ved at printe listerne før og efter

        System.out.println("Før vi tilføjer en ny student til linkedlist: " + linkedlist);
        linkedlist.add(new Student("Signe", 117));
        System.out.println("Efter vi har tilføjet en ny student til linkedlist: " + linkedlist);
        System.out.println("**********************************************************************************");
        System.out.println("Før vi har tilføjet en ny student til arraylist: " + arraylist);
        arraylist.add(new Student("Signe", 117));
        System.out.println("Efter vi har tilføjet en ny student til arraylist: " + arraylist);
        System.out.println("**********************************************************************************");

        // Hvad sker der hvis vi tilføjer et nyt Student-objekt på index 3 i hver af listerne?
        // Prøv det af. Tænk over hvad du tror, der vil ske og print så ud for at se om du har ret

        linkedlist.add(3, new Student("Signe", 117));
        System.out.println("Efter vi tilføjer student til index 3 i linkedlist: " + linkedlist);
        System.out.println("**********************************************************************************");
        arraylist.add(3, new Student("Signe", 117));
        System.out.println("Efter vi tilføjer student til index 3 i  arraylist: " + arraylist);
        System.out.println("**********************************************************************************");

        // Hvad sker der hvis vi tilføjer to ens Student-objekter til listerne?
        Student s1 = new Student("Tess", 111);
        Student s2 = new Student("Tess", 111);
        linkedlist.add(s1);
        linkedlist.add(s2);
        System.out.println("Efter vi har tilføjet to ens objekter til linkedlist: " + linkedlist);
        System.out.println("**********************************************************************************");
        arraylist.add(s1);
        arraylist.add(s2);
        System.out.println("Efter vi har tilføjet to ens objekter til arraylist: " + arraylist);
        System.out.println("**********************************************************************************");
    }

    public static void playWithSet(){
        // Lav et HashSet og et TreeSet med Student-objekter. Fyld det op ved at kalde DataReader.fillWithStudents() med dit sæt
        Set<Student> hashset = new HashSet<>();
        Set<Student> treeset = new TreeSet<>();
        DataReader.fillWithStudents(hashset, 10);
        DataReader.fillWithStudents(treeset, 10);

        // Tilføj et nyt Student-objekt objekt med metoden add()
        // Hvor i settet tror du, det bliver tilføjet? Test din teori ved at printe settet før og efter
        System.out.println("Før vi tilføjer en ny student til hashset: " + hashset);
        hashset.add(new Student("Signe", 117));
        System.out.println("Efter vi har tilføjet en ny student til hashset: " + hashset);
        System.out.println("**********************************************************************************");
        System.out.println("Før vi tilføjer en ny student til treeset: " + treeset);
        treeset.add(new Student("Signe", 117));
        System.out.println("Efter vi har tilføjet en ny student til treeset: " + treeset);
        System.out.println("**********************************************************************************");

        // Hvad sker der hvis vi tilføjer to ens Student-objekter?
        Student s1 = new Student("Tess", 111);
        Student s2 = new Student("Tess", 111);
        hashset.add(s1);
        hashset.add(s2);
        System.out.println("Efter vi har tilføjet to ens objekter til hashset: " + hashset);
        System.out.println("**********************************************************************************");
        treeset.add(s1);
        treeset.add(s2);
        System.out.println("Efter vi har tilføjet to ens objekter til treeset: " + treeset);
        System.out.println("**********************************************************************************");

    }


    public static void playWithMaps(){

        // Lav et HashMap() og et TreeMap med Student-objekter og Courses, hvor Student er key og Course er value
        // Fyld det op ved at kalde DataReader.fillWithStudentsAndCourses()
        Map<Student, Course> hashmap = new HashMap<>();
        Map<Student, Course> treemap= new TreeMap<>();
        DataReader.fillWithStudentsAndCourses(hashmap, 10);
        DataReader.fillWithStudentsAndCourses(treemap, 10);

        // Tilføj et nyt Student-objekt/Course-objekt par med metoden put()
        // Hvor i mappet tror du, det bliver tilføjet? Test din teori ved at printe settet før og efter
        System.out.println("Før vi tilføjer en ny student til hashmap: " + hashmap);
        hashmap.put(new Student("Signe", 117), new Course("PC kørekort"));
        System.out.println("Efter vi har tilføjet en ny student til hashmap: " + hashmap);
        System.out.println("**********************************************************************************");
        System.out.println("Før vi tilføjer en ny student til treemap: " + treemap);
        treemap.put(new Student("Signe", 117), new Course("PC kørekort"));
        System.out.println("Efter vi har tilføjet en ny student til treemap: " + treemap);
        System.out.println("**********************************************************************************");


        // Hvad sker der hvis vi tilføjer to Student/Course par hvor Student-objekterne er ens (og course forskellige)?
        Student s1 = new Student("Tess", 111);
        Student s2 = new Student("Tess", 111);
        Course c1 = new Course("Board game development");
        Course c2 = new Course("UML");
        hashmap.put(s1, c1);
        hashmap.put(s2, c2);
        System.out.println("Efter vi har tilføjet to ens student-objekter til hashmap: " + hashmap);
        System.out.println("**********************************************************************************");
        treemap.put(s1, c1);
        treemap.put(s2, c2);
        System.out.println("Efter vi har tilføjet to ens student-objekter til treemap: " + treemap);
        System.out.println("**********************************************************************************");

        // Og hvad sker der hvis vi tilføjer to Student/Course par hvor Course-objekterne er ens, men students forskellige?
        Student s3 = new Student("Tess", 123);
        Student s4 = new Student("Signe", 456);
        Course c5 = new Course("Java intro");
        Course c6 = new Course("Java intro");
        hashmap.put(s3, c5);
        hashmap.put(s4, c6);
        System.out.println("Efter vi har tilføjet to ens course-objekter til hashmap: " + hashmap);
        System.out.println("**********************************************************************************");
        treemap.put(s3, c5);
        treemap.put(s4, c6);
        System.out.println("Efter vi har tilføjet to ens course-objekter til treemap: " + treemap);
        System.out.println("**********************************************************************************");

    }

    public static void searchTimes(){
        List<Student> studlist = new ArrayList<>();
        Set<Student> studset = new HashSet<>();
        DataReader.fillWithStudents(studset, 10000000);
        DataReader.fillWithStudents(studlist, 10000000);

        long start = System.currentTimeMillis();
        System.out.println(studlist.contains(new Student("Signe", 30000000)));
        long end = System.currentTimeMillis();
        System.out.println("Time list: " + (end - start));
        start = System.currentTimeMillis();
        System.out.println(studset.contains(new Student("Signe", 30000000)));
        end = System.currentTimeMillis();
        System.out.println("Time set: " + (end - start));
    }

}
