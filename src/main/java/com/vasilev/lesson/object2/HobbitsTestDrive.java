package com.vasilev.lesson.object2;

class HobbitsTestDrive {
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;
        while (z < 2) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "Бильбо";
            System.out.println(h[z].name + " - Имя первого Хоббита с индексом 1");
            if (z == 1) {
                h[z].name = "Фродо";
            }
            if (z == 2) {
                h[z].name = "Сэм";
            }
            System.out.print(h[z].name + " - ");
            System.out.println("имя хорошего хоббита");
        }
    }
}