/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ram Kumar Lohani
 */
  
import java.io.*;    
public class DataInputExample {  
  public static void main(String[] args) throws IOException {  
    InputStream input = new FileInputStream("D:\\sus\\testout.txt");  
    DataInputStream inst = new DataInputStream(input);  
    int count = input.available();  
    byte[] ary = new byte[count];  
    inst.read(ary);  
    for (byte bt : ary) {  
      char k = (char) bt;  
      System.out.print(k+"-");  
    }
     System.out.println("\nLab No:14d Name:Susmita Lohani Roll No:23 Section:A");
  }  
} 
