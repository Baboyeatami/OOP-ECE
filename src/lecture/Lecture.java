/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lecture.Cat.Cat_woman;

/**
 *
 * @author Jamie
 */
public class Lecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            File file = new File("filename.txt");
            FileWriter myWriter = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(myWriter);

            if (file.length() == 0) {
                String input = JOptionPane.showInputDialog("Enter input");

                br.write(input);

                br.close();
                myWriter.close();

                myWriter.close();
            } else {
                String input = JOptionPane.showInputDialog("Enter input");
                br.newLine();
                br.append(input);

                br.close();
                myWriter.close();

                myWriter.close();
            }

            int sum = 0;

            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);

                sum = sum + Integer.parseInt(data);

            }
            myReader.close();

            System.out.println("sum id : " + sum);

        } catch (IOException ex) {
            Logger.getLogger(Lecture.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
