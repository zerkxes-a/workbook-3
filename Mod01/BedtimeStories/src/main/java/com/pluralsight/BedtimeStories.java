package com.pluralsight;


public class BedtimeStories {
    public static void main(String[] args) {
        System.out.println("Which story would you like to read?");
        System.out.println();
        try
        {
            FileInputStream fis = new FileInputStream("src/main/resources/poem.txt");
            // create a Scanner to reference the file to be read
            Scanner scanner = new Scanner(fis);
            String input;

            // read until there is no more data
            while(scanner.hasNextLine()) {
                input = scanner.nextLine();
                System.out.println(input);
            }
            // close the scanner and release the resources
            scanner.close();
        }
        catch(IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }
}
