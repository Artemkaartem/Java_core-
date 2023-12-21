package ru.gb.dz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Print {

    public static void print()
    {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("notes3.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (line != null) {
            System.out.println(line);
            try {
                line = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
