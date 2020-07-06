package s_case_study_dictionary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DictionaryManager {
    static Scanner scanner = new Scanner(System.in);
    static List <Word> wordList = new ArrayList<>();
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        int action=0;
//        Word word = new Word("hello","hello","hello","hello","hello","hello");
//        writeWordObject(word);
        while (action!=5){
            System.out.println("Input action that you want to chosse: ");
            System.out.println("---- Dictionary Maneger -----\n1.Define a word" +
                    "\n2.Drop a word\n3.Export all word");
            action = Integer.parseInt(scanner.nextLine());
            switch (action){
                case 1:
                    System.out.println("Input keyword you want to lookup:");
                    String keyword = scanner.nextLine();
                    lookup(keyword);
                case 2:

//                    define();
                    break;
                case 3:
                    drop();
                    break;
                case 4:
                    export();
                    break;
                case 5:
                    break;
            }
        }
    }
    public static void define(){
        readWordOject();
        System.out.println("Input keyword you want to define: ");
        String keyword = scanner.nextLine();
        List<String> listString=new ArrayList<>();
        Word word = null;
        String noun = "";
        String definition = "";
        String string="";
        String verb="";
        String synonymous="";
        for (int i = 0; i <wordList.size() ; i++) {
            if(keyword.equals(wordList.get(i).getKeyword())){
                word = wordList.get(i);
                wordList.remove(i);
            }
        }
        System.out.println("Input property you want to define:[keyword/pronunciation/noun/adjective/verb/synonymous]");
        String propertyDefine =scanner.nextLine();
        switch (propertyDefine){
            case "noun":
                System.out.println("Enter more noun (end by the word: exit):");
                string=scanner.nextLine();
                while (!string.equals("exit")){
                    listString.add(string);
                    string=scanner.nextLine();
                }
                for (int j = 0; j < listString.size() ; j++) {
                    noun+=listString.get(j)+"\n";
                }
                word.setNoun(noun);
                wordList.add(word);
                break;
            case "adjective":
                break;
            case "verb":
                break;
            case "synonymous":
                break;

        }
//
//        writeWordObject(word1);
    }
    public static void drop(){

    }
    public static void export(){

    }
    public static void lookup(String word){
        readWordOject();
        if(wordList==null){
            System.out.println("Dictionary is empty, please input new word");
            addWord();
        }else {
            for (int i = 0; i < wordList.size(); i++) {
                if(word.equals(wordList.get(i).getKeyword())){
                    System.out.println("The word you want to lookup is: ");
                    System.out.println(wordList.get(i).toString());
                    break;
                }  else if(i==wordList.size()-1){
                    System.out.println("The word you want to find does not exist");
                    System.out.println("Do you want to add this word into dictionary\n1.Yes\n2.No");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            addWord();
                            break;
                        case 2:
                            break;
                    }
                }
            }
        }
    }
    public static void writeWordObject(Word word){
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("src\\s_case_study_dictionary\\words.txt"));

                objectOutputStream.writeObject(word);

            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readWordOject(){
        boolean check = true;
        List <Word> wordList = new ArrayList<>();
        ObjectInputStream ois= null;
        try {
            ois = new ObjectInputStream(new FileInputStream("src\\s_case_study_dictionary\\words.txt"));
            while (check){
                Word word = (Word) ois.readObject();
                if(word!=null){
                    wordList.add(word);
                }
                else {
                    check= false;
                }
            }
            ois.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }
    public static void addWord(){
        System.out.println("Input keyword");
        String keyword = scanner.nextLine();
        System.out.println("Input pronunciation");
        String pronunciation = scanner.nextLine();
        System.out.println("Input noun");
        String noun = scanner.nextLine();
        System.out.println("Input adjective");
        String adjective = scanner.nextLine();
        System.out.println("Input verb");
        String verb = scanner.nextLine();
        System.out.println("Input synonymous");
        String synonymous = scanner.nextLine();
        Word word = new Word(keyword, pronunciation, noun, adjective, verb, synonymous);
    }
}
