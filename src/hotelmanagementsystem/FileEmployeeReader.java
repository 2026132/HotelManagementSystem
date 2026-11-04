/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ander
 */
public class FileEmployeeReader {
     public static void main (String[] args){
            File directory = new File("C:\\Users\\ander\\Documents\\NetBeansProjects\\HotelManagementSystem\\Hotel_Employees_23.txt");
            try (Scanner scanner = new Scanner(directory)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
                } catch (FileNotFoundException e) {
                        System.out.println("File not found: " + e.getMessage());
                }
            }
        }
