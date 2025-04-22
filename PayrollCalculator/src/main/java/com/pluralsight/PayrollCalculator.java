package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Pattern;

public class PayrollCalculator {
    public static void main(String[] args) {
        try {
            //this is setting the start place(loading file)
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");

            //buffered reader added to load file incrementally
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input;

            //disregard the first line of code from while loop, read first + discard
            bufferedReader.readLine();

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
                System.out.printf("Employee Name: %s Employee ID: %d Gross Pay: %.2f \n", employee.getName(), employee.getEmployeeID(), employee.getGrossPay());
            }
            //close that shiz(UNIVERSITY) out
            bufferedReader.close();
        } catch (Exception e) {
        }

    }
}
