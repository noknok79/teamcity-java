package com.infojolt;

public class App 
{
    public static void main( String[] args )
    {
        String name = "Mark";
        printGreeting(name);
    }

    private static void printGreeting(String name) {
        System.out.println("Hello " + name + ", Welcome to TeamCity CICD Testing!");
    }
}
