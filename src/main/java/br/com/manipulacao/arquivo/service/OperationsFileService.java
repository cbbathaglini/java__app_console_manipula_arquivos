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
            InputStream inputStream = OperationsFileService.class.getClassLoader().getResourceAsStream("utils/" + filename);

            if (inputStream == null) {
                throw new FileNotFoundException("Arquivo não encontrado");
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
