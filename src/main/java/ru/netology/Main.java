package ru.netology;

public class Main {
    public static void main (String[] ars){
        MagicBox<Integer> numb = new MagicBox<>(3);
        MagicBox<String> texts = new MagicBox<>(3);

        numb.add(5);
        numb.add(12);
        numb.add(25);
        System.out.println(numb.pick());

        texts.add("alfa");
        texts.add("beta");
        texts.add("gamma");
        System.out.println(texts.pick());

    }
}
