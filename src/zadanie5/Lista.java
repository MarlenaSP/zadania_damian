package zadanie5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Lista {
    private int[] numbers;
    private int capacity;
    private int size;


    public Lista(int capacity) {
        this.capacity = capacity;
        this.numbers = new int[capacity];
        this.size = 0;
    }

    public void addElement(int number) {
        if (size < capacity) {
            numbers[size] = number;
            size++;
        } else {
            System.out.println("Unable to add item, max. capacity reached!");
        }
    }

    public int find(int searchNumber) {
        for (int i = 0; i < size; i++) {
            if (numbers[i] == searchNumber) {
                return i;
            }
        }
        return -1;
    }

    public void write() {
        System.out.println("Lista:");
        System.out.println("Pojemność: " + capacity);
        System.out.println("Rozmiar: " + size);
        System.out.print("Elementy: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void removeFirst(int deleteNumber) {
        for (int i = 0; i < size; i++) {
            if (numbers[i] == deleteNumber) {
                for (int j = 0; j < size; j++) {
                    numbers[i + j] = numbers[i + (j + 1)];
                }
                break;
            }
        }
        size--;
    }

    public void removeRepeats() {
        int[] newTab = new int[capacity];
        int newSize = 0;
        boolean ifRepeat;
        for (int i = 0; i < size; i++) {
            ifRepeat = false;
            for (int j = 0; j < newSize; j++) {
                if (numbers[i] == newTab[j]) {
                    ifRepeat = true;
                    break;
                }
            }
            if (!ifRepeat) {
                newTab[newSize] = numbers[i];
                newSize++;
            }
        }
        numbers = newTab;
        size = newSize;
    }

    public void saveToFile(String fileName) {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));
            output.writeObject(Arrays.copyOf(numbers, size));
            output.close();
            System.out.println("List saved to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error while saving to file");
        }
    }

}




