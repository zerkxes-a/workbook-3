package com.pluralsight;
import java.util.Scanner;
import java.io.*;
import java.util.regex.Pattern;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class PayrollCalculator {
    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner(System.in);
            //this is setting the start place(loading file)
            System.out.print("Please enter the name of the file to read from: ");
            String fileName = userInput.nextLine().trim();
            System.out.print("Please enter the name of the payroll file you'd like to create: ");
            String newFile = userInput.nextLine().trim();//wtire in new file
            FileReader fileReader = new FileReader("src/main/resources/" + fileName);
            FileWriter fileWriter = new FileWriter("src/main/resources/" + newFile);
            //buffered reader added to load file incrementally
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String input;


            //disregard the first line of code from while loop, read first + discard
            bufferedReader.readLine();
            bufferedWriter.write("id | name | gross pay \n");
            //take each line and split into the 4 different parts, go over the entire block of text from source material
            while ((input = bufferedReader.readLine()) != null) {
                //splits here
                String[] inputSplit = input.split(Pattern.quote("|"));
                //here are the parts
                int employeeID = Integer.parseInt(inputSplit[0]);
                String name = inputSplit[1];
                float hoursWorked = Float.parseFloat(inputSplit[2]);
                float payRate = Float.parseFloat(inputSplit[3]);
                //now you have a new employee from the file(database can be used as well)
                Employee employee = new Employee(employeeID, name, hoursWorked, payRate);


                //tokens array??? create new employee object
//                System.out.printf("Employee Name: %s Employee ID: %d Gross Pay: %.2f \n", employee.getName(), employee.getEmployeeID(), employee.getGrossPay());
//file writer starts here, gotta keep it within the instance of each employee id to write into file
                //setting up file writer

                bufferedWriter.write(String.format("%d | %s | %.2f \n", employee.getEmployeeID(), employee.getName(), employee.getGrossPay()));


            }
            //close that shiz(UNIVERSITY) out
            bufferedReader.close();
            bufferedWriter.close();

        } catch (Exception e) {
            System.out.print("Error: file not available");

        }

    }
}
