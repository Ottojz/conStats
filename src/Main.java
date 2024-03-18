import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("task 1");

        byte age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + ", то человек совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека " + age + ", то возраст совершеннолетия еще не наступил, нужно немного подождать");
            //System.out.println("КожАнный еще на личиночной стадии");
        }

        //task 2
        System.out.println("task 2");

        byte temperature = 14;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        //task 3
        System.out.println("task 3");

        byte speed = 99;
        if (speed > 60) {
            System.out.println("Ты заплатишь за это! (штраф)");
        }
        if (speed <= 60){
            System.out.println("Можно ехать спокойно");
        }

        //task 4
        System.out.println("task 4");

        age = 24;
        if (age >= 2 && age < 7) {
            System.out.println("Нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 17){
            System.out.println("Нужно ходить в школу");
        }
        if (age >= 18 && age < 24){
            System.out.println("Нужно ходить в университет");
        }
        if (age >= 24){
            System.out.println("Нужно ходить на работу");
        }

/*
Как я понял, конструкция else срабатывает только относительно последней строки с if.
Поэтому не понимаю, как ее здесь применить.
Посмотрел разбор домашки, ответа на этот вопрос тоже не нашел, хотя я не один столкнулся с этой проблемой.
Как и в разборе домашки, не стал использовать else востальных заданиях, так как там больше одного оператора if
*/

        //task 5
        System.out.println("task 5");

        age = 13;
        if (age < 5) {
            System.out.println("Если возраст ребенка " + age + ", то ребенок не может кататься на аттракционе");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка " + age + ", то ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка " + age + ", то ребенок может кататься без сопровождения взрослого.");
        }
//Вариант решения со второй булевой переменной увидел в разборе домашки - понял.

        //task 6
        System.out.println("task 6");

        byte passengers = 13;

        byte wholeCapacity = 102;
        byte sittingCapacity = 60;
        if (passengers < sittingCapacity) {
            System.out.println("В вагоне еще " + (wholeCapacity - passengers) + " свободных мест");
            System.out.println("Из них " + (sittingCapacity - passengers) + " сидячие");
        }
        if (passengers >= sittingCapacity && passengers < wholeCapacity) {
            System.out.println("В вагоне еще " + (wholeCapacity - passengers) + " свободных мест");
            System.out.println("Сидячих мест нет");
        }
        if (passengers >= wholeCapacity) {
            System.out.println("Свободных мест нет");
        }

        //task 6 alternative (Через 2 переменные, если пассажиры не всегда сразу занимают сидячие места)
        System.out.println("task 6 alternative");

        byte standingPassengers = 40;
        byte sittingPassangers = -62;

        wholeCapacity = 102;
        sittingCapacity = 60;
        byte standingCapacity = (byte) (wholeCapacity - sittingCapacity);
        if (standingPassengers > standingCapacity || standingPassengers < 0) {
            System.out.println("Неверный диапазон стоячих мест");
        }
        if (sittingPassangers > sittingCapacity || sittingPassangers < 0) {
            System.out.println("Неверный диапазон сидячих мест");
        }
        if (standingPassengers >= 0 && standingPassengers < standingCapacity) {
            System.out.println("В вагоне еще " + (standingCapacity - standingPassengers) + " стоячих мест");
        }
        if (sittingPassangers >= 0 && sittingPassangers < sittingCapacity) {
            System.out.println("В вагоне еще " + (sittingCapacity - sittingPassangers) + " сидячих мест");
        }
        if (standingPassengers == standingCapacity) {
            System.out.println("В вагоне нет стоячих мест");
        }
        if (sittingPassangers == sittingCapacity) {
            System.out.println("В вагоне нет сидячих мест");
        }

        //task 7
        System.out.println("task 7");

        int one = 1;
        int two = 3;
        int three = 3;

        boolean oneIsTheBiggest = one > two && one > three;
        boolean twoIsTheBiggest = two > one && two > three;
        boolean threeIsTheBiggest = three > two && one < three;

        if (oneIsTheBiggest) {
            System.out.println("Переменная one наибольшая");
            } else if (twoIsTheBiggest) {
            System.out.println("Переменная two наибольшая");
            } else if (threeIsTheBiggest) {
            System.out.println("Переменная three наибольшая");
            } else {
            System.out.println("Какие-то переменные равны");
        }
//Пересмотрел разбор домашки, так и не понял как уместить все в 2 ветки (если использовать else без else if)
//Решил оставить и это решение, так как в задании указано, что нужно написать программу, которая вычисляет бОльшее число, а не бОльшие
        //task 7 alternative (только через if и 3 ветки)
        System.out.println("task 7 alternative");

        one = 1;
        two = 3;
        three = 3;

        oneIsTheBiggest = one >= two && one >= three;
        twoIsTheBiggest = two >= one && two >= three;
        threeIsTheBiggest = three >= two && one <= three;

        if (oneIsTheBiggest) {
            System.out.println("Переменная one наибольшая");
        }
        if (twoIsTheBiggest) {
            System.out.println("Переменная two наибольшая");
        }
        if (threeIsTheBiggest) {
            System.out.println("Переменная three наибольшая");
        }
    }
}