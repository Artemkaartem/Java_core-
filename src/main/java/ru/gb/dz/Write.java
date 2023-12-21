package ru.gb.dz;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Write {
    public static void write_to_a_file() {
        System.out.println("Введите заметку: ");
        Scanner sc = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("notes3.txt", true)) {

            String write = sc.nextLine();
            String data = getString();

            writer.append(data);
            writer.append(write);
            writer.append('\n');

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    private static String getString(){
        StringBuilder data = new StringBuilder();
        data.append(LocalDateTime.now().getDayOfMonth());
        data.append(".");
        data.append(LocalDateTime.now().getMonthValue());
        data.append(".");
        data.append(LocalDateTime.now().getYear());
        data.append(" -> ");
        return String.valueOf(data);
    }
}
