package collections;

import entities.Course;
import entities.Student;
import util.DataReader;

import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.*;

public class PlayingWithCollections {

    public static void main(String[] args) {
      playWithLists();
      playWithSet();
      playWithMaps();
    }

    public static void playWithLists(){

        // Lav en LinkedList og en ArrayList med Student-objekter. Fyld dem op med objekter ved at kalde DataReader.fillWithStudents() med din liste
        LinkedList<Student> linkedList = new LinkedList<>();
        ArrayList<Student> arrayList = new ArrayList<>();
        DataReader.fillWithStudents(linkedList,5);
        DataReader.fillWithStudents(arrayList, 5);


        // Tilføj et nyt Student-objekt objekt med metoden add() til hver af listerne.
        // Hvor i listerne tror du, det bliver tilføjet? Test din teori ved at printe listerne før og efter
        System.out.println("Before adding a new student:");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayList: " + arrayList);

        linkedList.add(new Student("Valdemar", 22));
        arrayList.add(new Student("Big Hank", 22));

        System.out.println("\nAfter adding a new student:");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayList: " + arrayList);

        // Hvad sker der hvis vi tilføjer et nyt Student-objekt på index 3 i hver af listerne?
        // Prøv det af. Tænk over hvad du tror, der vil ske og print så ud for at se om du har ret

        linkedList.add(new Student("VP", 22));
        arrayList.add(new Student("BH", 22));

        System.out.println("\nAfter adding a new student on index 3:");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayList: " + arrayList);

        // Hvad sker der hvis vi tilføjer to ens Student-objekter?
        linkedList.add(new Student("Hanky", 6));
        arrayList.add(new Student("Hanky", 6));

        System.out.println("\nAfter adding duplicate students:");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayList: " + arrayList);
    }

    public static void playWithSet(){
        // Lav et HashSet og et TreeSet med Student-objekter. Fyld det op ved at kalde DataReader.fillWithStudents() med dit sæt
        HashSet<Student> hashSet = new HashSet<>();
        TreeSet<Student> treeSet = new TreeSet<>();
        DataReader.fillWithStudents(hashSet, 10);
        DataReader.fillWithStudents(treeSet, 10);

        // Tilføj et nyt Student-objekt objekt med metoden add()
        // Hvor i settet tror du, det bliver tilføjet? Test din teori ved at printe settet før og efter
        System.out.println("\nBefore: ");
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);

        hashSet.add(new Student("Hank", 142));
        treeSet.add(new Student("Lil Yip", 154));

        System.out.println("\nAfter: ");
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);

        // Hvad sker der hvis vi tilføjer to ens Student-objekter?

        // Ekstra - hvad vil det sige, at Student-objekterne er ens? Kan vi ændre på dette?

    }


    public static void playWithMaps(){

        // Lav et HashMap() med Student-objekter og Courses, hvor Student er key og Course er value
        // Fyld det op ved at kalde DataReader.fillWithStudentsAndCourses()
        Map<Student, Course> hashMap = new HashMap<>();
        Map<Student, Course> treeMap = new TreeMap<>();
        DataReader.fillWithStudentsAndCourses(hashMap, 10);
        DataReader.fillWithStudentsAndCourses(treeMap, 10);

        // Tilføj et nyt Student-objekt/Course-objekt par med metoden put()
        // Hvor i mappet tror du, det bliver tilføjet? Test din teori ved at printe settet før og efter
        System.out.println("Before adding Student/Course objects hashMap: " + hashMap);
        hashMap.put(new Student("HankyBanky", 160),new Course("DAT01"));
        System.out.println("After adding to hashMap: " + hashMap);
        System.out.println("Before adding Student/Course objects treeMap: " + treeMap);
        treeMap.put(new Student("Benjamin", 185), new Course("DAT01"));
        System.out.println("After adding to treeMap: " + treeMap);

        // Hvad sker der hvis vi tilføjer to Student/Course par hvor Student-objekterne er ens?
        hashMap.put(new Student("William",120), new Course("DAT02"));
        hashMap.put(new Student("William",120), new Course("DAT03"));
        System.out.println("After adding duplicate Student objects: " + hashMap);

        treeMap.put(new Student("William", 120), new Course("DAT02"));
        treeMap.put(new Student("William", 120), new Course("DAT03"));
        // Og hvad sker der hvis vi tilføjer to Student/Course par hvor Course-objekterne er ens?
    }

}
