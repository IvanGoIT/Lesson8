import animals.Animal;
import sun.misc.IOUtils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileDemoProgram {

    static void writeToFile(String fileName, int[] array) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("" + array.length + "\n");
            for (int value : array) {
                writer.write("" + value + " ");
            }
            writer.flush();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    static int[] readFromFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line1 = br.readLine();
            String line2 = br.readLine();

            int arraySize = Integer.parseInt(line1);
            int[] resultArray = new int[arraySize];

            String[] elements = line2.split(" ");
            for(int i = 0; i < resultArray.length; i++) {
                resultArray[i] = Integer.parseInt(elements[i]);
            }
            return resultArray;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    static void executeDemoConsoleWrite() {
        String fileName = "files/demo console file.txt";

        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();

        writeToFile(fileName, new int[]{value1, value2});

        int[] resultArray = readFromFile(fileName);
        showArray(resultArray);
    }

    public static void main(String[] args) {
        String fileName = "files/demo file.txt";

        // запись в файл
        int[] array = new int[] {1, 2, 3, 4, 6, 6, 7, 7, 7000};
        writeToFile(fileName, array);

        // считывание с файла
        int[] resultArray = readFromFile(fileName);
        showArray(resultArray);


        // запись в файл с консоли
        executeDemoConsoleWrite();
    }

    static void showArray(int[] array) {
        for(int element : array) {
            System.out.print("" + element + " ");
        }
    }
}
