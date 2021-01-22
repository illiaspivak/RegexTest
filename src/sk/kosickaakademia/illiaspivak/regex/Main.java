package sk.kosickaakademia.illiaspivak.regex;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Regex regex = new Regex();
        ArrayList<String> list = new ArrayList<String>();
        try{
            FileReader fr = new FileReader("resourse/money.txt");
            BufferedReader bf = new BufferedReader(fr);
            String line;
            for(int i=0; i<26; i++){
                line=bf.readLine();
                list.add(line);
            }
            fr.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++)
        {
            String vysledok;
            if(regex.checkValue(list.get(i))){
                vysledok = "Yes";
            }else
                vysledok = "No";
            String a = list.get(i) +" "+ vysledok;
            result.add(a);
        }
        for (int i = 0; i < result.size(); i++){
            System.out.println( result.get(i) );
        }
        String res = "";
        for (int i = 0; i < result.size(); i++)  {
            res += "\n"+ result.get(i);
        }
        System.out.println(res);
        try(FileWriter writer = new FileWriter("resourse/result.txt", false))
        {
            writer.write(res);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }


    }