package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        try{
        Scanner input = new Scanner(System.in);

        String[] quotes;
        quotes = new String[]{"", "Fear is the mindkiller. Fear is the little-death that brings total obliteration.", "Justifications only matter to the Just", "Sometimes a hypocrite is nothing more than a man is the process of changing", "I reject your reality and substitute my own", "In the midst of chaos, there is always beauty waiting to be discovered", "There are three things all wise men fear: the sea in storm, a night with no moon, and the anger of a gentle man.", "You have to be a bit of a liar to tell a story the right way.", "Words can light fires in the minds of men. Words can wring tears from the hardest hearts.", "Accept the pain, but dont accept that you deserved it.", "Life before Death. Strength before Weakness, Journey before Destination."};
        System.out.print("Please enter a quote number from 1-10: ");
            int index = input.nextInt();
        System.out.println(quotes[index]);
        }catch (Exception e) {
            System.out.println("Please read instructions and try again :)");
        


}
}