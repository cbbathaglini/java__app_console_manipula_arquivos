package br.com.manipulacao.arquivo.service;


import java.io.*;
import java.util.Scanner;

public class OperationsFileService {
    private Scanner scanner;
    
    public OperationsFileService(){
        this.scanner = new Scanner(System.in);
    }

    public OperationsFileService(Scanner scanner){
        this.scanner = scanner;
    }

    public void readFile() {
        try {
            System.out.println("Informe o nome do arquivo: ");
            Scanner in = new Scanner(System.in);
            String filename = in.nextLine();
            filename = "utils/" + filename;

            FileReader fileReader = new FileReader(filename);

            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();


        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void writeFile(){
        try{
            System.out.println("Informe o nome do arquivo: ");
            Scanner in = new Scanner(System.in);
            String filename = in.nextLine();
            filename = "utils/" + filename;

            BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true));
            System.out.println("Informe o conteúdo que será concatenado no arquivo: ");
            String content = in.nextLine();

            writer.write(content);
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
