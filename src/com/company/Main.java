package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Элементы массива умноженные на 2:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]*2 + " ");
        }
        in.close();
    }
}