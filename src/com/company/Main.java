package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
	    try(FileWriter fileWriter=new FileWriter("D:\\test.txt",false)) {
            System.out.println("Введите строку, которую хотите записать в файл: ");
//while (scanner.hasNextLine()) {
            fileWriter.write(scanner.nextLine()+"\n");
//}
        } catch (IOException e) {
            e.printStackTrace();
        }
	    System.out.println("Вы записали в файл: ");
	    FileReader fileReader= null;
	    int c;
    	try {
	        fileReader = new FileReader("D:\\test.txt");
	        while((c=fileReader.read())!=-1)
                System.out.print(Character.toString(c));
	    } catch (IOException fileNotFoundException) {
    	    fileNotFoundException.printStackTrace();
	    }
    	System.out.println();
	    System.out.println("Перезапишем информацию в файле:");
        try(FileWriter fileWriter=new FileWriter("D:\\test.txt",false)) {
            System.out.println("Введите строку, которую хотите записать в файл: ");
//while (scanner.hasNextLine()) {
            fileWriter.write(scanner.nextLine()+"\n");
//}
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Вы записали в файл: ");
        try {
            fileReader = new FileReader("D:\\test.txt");
            while((c=fileReader.read())!=-1)
                System.out.print(Character.toString(c));
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        System.out.println();
        System.out.println("Добавим строку в файл:");
        try(FileWriter fileWriter=new FileWriter("D:\\test.txt",true)) {
            System.out.println("Введите строку, которую хотите записать в файл: ");
//while (scanner.hasNextLine()) {
            fileWriter.write(scanner.nextLine());
            fileWriter.write("\n");
//}
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Вы записали в файл: ");
        try {
            fileReader = new FileReader("D:\\test.txt");
            while((c=fileReader.read())!=-1)
                System.out.print(Character.toString(c));
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
