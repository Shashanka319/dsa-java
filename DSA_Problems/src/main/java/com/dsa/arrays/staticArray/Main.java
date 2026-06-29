package com.dsa.arrays.staticArray;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        String inputfile="C:\\Xworkz Internship\\dsa-java\\DSA_Problems\\src\\main\\resources\\file1.txt";
        String outputFile="C:\\Xworkz Internship\\dsa-java\\DSA_Problems\\src\\main\\resources\\output.txt";
        Main main =new Main();
        main.read(inputfile,outputFile);
    }
    public void read(String inputfile,String outputFile){
        try(FileInputStream inputStream= new FileInputStream(inputfile);
            FileOutputStream fileOutputStream = new FileOutputStream(outputFile)){
            int data;
            while((data = inputStream.read()) != -1){

                fileOutputStream.write(data);
            }
        }catch (Exception exp){
            System.out.println("Exeption while reading/writing the data from file");
        }
    }
}
