package ru.netology;

import java.util.Random;

public class MagicBox<T> {
    private Integer size;
    private T[] items;

    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public boolean add(T item) {
        for (int i = 0; i < size; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            } else {
                continue;
            }
        }
        return false;
    }

    public T pick() {
        Random random = new Random();
        int randomInt = random.nextInt(size);
        for (T it : items) {
            if (it != null) {
                continue;
            } else {
                throw new RuntimeException("The box is not full");
            }
        }
        return items[randomInt];
    }
}
