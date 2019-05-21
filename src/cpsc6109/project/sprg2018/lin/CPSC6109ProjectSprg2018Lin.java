/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc6109.project.sprg2018.lin;

import java.io.*;
import java.util.*;

/**
 *
 * @author Lu Lin
 */
public class CPSC6109ProjectSprg2018Lin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LCS myObject1 = new LCS();
        LCS myObject2 = new LCS();
        LCS myObject3 = new LCS();
        List<Integer> myList1 = new ArrayList<Integer>();
        List<Integer> myList2 = new ArrayList<Integer>();
        List<Integer> myList3 = new ArrayList<Integer>();
        File myFile1 = new File("c:\\input1.txt");
        File myFile2 = new File("c:\\input2.txt");
        File myFile3 = new File("c:\\input3.txt");
        BufferedReader reader1 = null;
        BufferedReader reader2 = null;
        BufferedReader reader3 = null;
        
        try{
            reader1 = new BufferedReader(new FileReader(myFile1));
            String text = null;
            while((text = reader1.readLine()) != null) {
                String[] strNumbers = text.split(" ");
                for(String strNumber: strNumbers) {
                    myList1.add(Integer.parseInt(strNumber));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader1 != null) {
                    reader1.close();
                }
            } catch (IOException e) {
                
            }
        }
        
        try{
            reader2 = new BufferedReader(new FileReader(myFile2));
            String text = null;
            while((text = reader2.readLine()) != null) {
                String[] strNumbers = text.split(" ");
                for(String strNumber: strNumbers) {
                    myList2.add(Integer.parseInt(strNumber));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader2 != null) {
                    reader2.close();
                }
            } catch (IOException e) {
                
            }
        }
        
        try{
            reader3 = new BufferedReader(new FileReader(myFile3));
            String text = null;
            while((text = reader3.readLine()) != null) {
                String[] strNumbers = text.split(" ");
                for(String strNumber: strNumbers) {
                    myList3.add(Integer.parseInt(strNumber));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader3 != null) {
                    reader3.close();
                }
            } catch (IOException e) {
                
            }
        }
                
        int[] N1 = new int[myList1.size()];
        for (int i=0; i<N1.length; i++) {
            N1[i] = myList1.get(i).intValue();
        }
        int[] N2 = new int[myList2.size()];
        for (int i=0; i<N2.length; i++) {
            N2[i] = myList2.get(i).intValue();
        }
        int[] N3 = new int[myList3.size()];
        for (int i=0; i<N3.length; i++) {
            N3[i] = myList3.get(i).intValue();
        }
        
        int[] S1 = new int[10];
        for (int i=0; i<10; i++) {
            S1[i] = i+1;
        }
        int[] S2 = new int[20];
        for (int i=0; i<20; i++) {
            S2[i] = i+1;
        }
        int[] S3 = new int[50];
        for (int i=0; i<50; i++) {
            S3[i] = i+1;
        }
        
        System.out.println("The max number of bridges is the same as length of LCS.");
        System.out.println("For the first input file the max number of bridges is " + myObject1.calculateLCS(N1, S1));
        System.out.println("For the second input file the max number of bridges is " + myObject2.calculateLCS(N2, S2));
        System.out.println("For the third input file the max number of bridges is " + myObject3.calculateLCS(N3, S3));


    }
    
}
