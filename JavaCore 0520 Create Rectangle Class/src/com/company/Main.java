package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/*

Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.
Примеры: — заданы 4 параметра: left, top, width, height — ширина/высота не задана (оба равны 0)
— высота не задана (равно ширине) создаём квадрат —
создаём копию другого прямоугольника (он и передаётся в параметрах)

Требования: 1. У класса Rectangle должны быть переменные top, left, width и height с типом int.
2. У класса должен быть хотя бы один конструктор.
3. У класса должно быть хотя бы два конструктора.
4. У класса должно быть хотя бы три конструктора.
5. У класса должно быть хотя бы четыре конструктора.

*/

// public class Rectangle
public class Main {
    int top;
    int left;
    int height;
    int width;

    public Main(int top) {
     this.top = top;
    }

    public Main(int top, int left) {
        this.top = top;
        this.left = left;
    }

    public Main(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public Main(int top, int left, int width, int height) {
        this.top = top;
        this.height = height;
        this.left = left;
        this.width = width;
    }

    public static void main(String[] args) {
    }
}




