package CaseStudy;

import input_output_binary.SanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
    public static ArrayList<Word> listWordAll=DocObject();
    public static void main(String[] args) {



        System.out.println("Select action you want: lookup/define/drop/export [word]");
        System.out.print("Action: ");
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        String[] groupWord=word.split(" ");
        switch (groupWord[0]){
            case "lookup":
                doLookup(groupWord[1]);
                break;
            case "drop":
                doDrop(groupWord[1]);
                break;
            case "export":
                doExport(groupWord[1]);
                break;
        }


    }
    public static void doExport(String path){

    }
    public static void doDrop(String word) {
        ArrayList<Word> listWordDrop=DocObject();


        for (int i = 0; i <listWordDrop.size() ; i++) {
            if(word.equals(listWordDrop.get(i).getKeyword())){
                listWordDrop.remove(listWordDrop.get(i));
            }
        }
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src\\CaseStudy\\wordObject.txt"));
            for (int i = 0; i < listWordDrop.size(); i++) {
                oos.writeObject(listWordDrop.get(i));
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Drop word successfull...");

    }

    private static void doLookup(String word) {
        for (int i = 0; i <listWordAll.size() ; i++) {
                if(word.equals(listWordAll.get(i).getKeyword())){
                System.out.println(listWordAll.get(i).toString());
            }
        }
    }

    public static void GhiObject(Word word){
        ArrayList<Word> listWord=new ArrayList<>();
        boolean cont=true;
        try {

            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src\\CaseStudy\\wordObject.txt"));
            while(cont){
                Word words=(Word) ois.readObject();

                if (words != null) {
                    listWord.add(words);
                } else {
                    cont = false;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        listWord.add(word);
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src\\CaseStudy\\wordObject.txt"));
            for (int i = 0; i < listWord.size(); i++) {
                oos.writeObject(listWord.get(i));
            }

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Word> DocObject(){
        ArrayList<Word> listWord=new ArrayList<>();
        boolean cont=true;
        try {

            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src\\CaseStudy\\wordObject.txt"));
            while(cont){
               Word word=(Word) ois.readObject();

                if (word != null) {
                    listWord.add(word);
                } else {
                    cont = false;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
       return listWord;
    }
}
