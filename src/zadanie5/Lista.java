package zadanie5;

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
        for(int i=0; i<size; i++){
            System.out.print(numbers[i] +" ");
        }
        System.out.println();
    }
}




