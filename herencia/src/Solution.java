import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScoress){
        super(firstName,lastName,identification);
        testScores = testScoress;
    }

    public char calculate(){
        int note = 0;
        for(int i = 0; i< testScores.length;i++){
            note = note + testScores[i];
        }
        note = note / testScores.length;

        if(note<40){
            return 'T';
        }else if(note >= 40 && note <55){
            return 'D';
        }else if(note >= 55 && note <70){
            return 'P';
        }else if(note >= 70 && note <80){
            return 'A';
        }else if(note >= 80 && note <90){
            return 'E';
        }else if(note >= 90 && note <=100){
            return 'O';
        }
        return 'G';
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}