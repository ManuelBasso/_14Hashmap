import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Manuel");
        student.put(20, "Luca");
        student.put(18, "Ale");
        student.put(100, "Lll");
        student.put(9, "Lll");
        System.out.println("Non ordinato " + student);


        //Per ordinare per key utilizzo TreeMap
        Map<Integer,String> sortStudents = new TreeMap<>(student);
        System.out.println("Ordinato per key " + sortStudents);


    }
}