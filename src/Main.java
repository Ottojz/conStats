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

        byte temperature = 12;
        if (temperature < 5) {
            System.out.println("На улице холожно, нужно надель шапку");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
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

        byte ageInTask4 = 99;
        if (ageInTask4 >= 2 && ageInTask4 <= 6) {
            System.out.println("Нужно ходить в детский сад");
        }
        if (ageInTask4 >= 7 && ageInTask4 <= 17){
            System.out.println("Нужно ходить в школу");
        }
        if (ageInTask4 >= 18 && ageInTask4 <= 24){
            System.out.println("Нужно ходить в университет");
        }
        if (ageInTask4 >= 24){
            System.out.println("Нужно ходить на работу");
        }
        else {
            System.out.println("Даже до садика не дорос");
        }

        //task 5
        System.out.println("task 5");

        byte ageInTask5 = 9;
        if (ageInTask5 < 5) {
            System.out.println("Если возраст ребенка " + ageInTask5 + ", то ребенок не может кататься на аттракционе");
        }
        if (ageInTask5 >= 5 && ageInTask5 < 14){
            System.out.println("Если возраст ребенка " + ageInTask5 + ", то ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Если возраст ребенка " + ageInTask5 + ", то ребенок может кататься без сопровождения взрослого.");
        }

        //task 6
        System.out.println("task 6");

        byte passengers = 70;
        byte wholeCapacity = 102;
        byte sittingCapacity = 60;
        byte currentEmptySpace = (byte) (wholeCapacity - passengers);
        if (currentEmptySpace > 42 && currentEmptySpace <= 102) {
            System.out.println("В вагоне еще " + (currentEmptySpace) + " свободных мест");
            System.out.println("Из них " + (sittingCapacity - passengers) + " сидячих");
        }
        else {
            System.out.println("Свободных мест нет");
        }
        if (currentEmptySpace > 0 && currentEmptySpace <= 42) {
            System.out.println("В вагоне еще " + (currentEmptySpace) + " свободных мест");
            System.out.println("Сидячих мест нет");
        }

        //task 7
        System.out.println("task 7");

        int one = 1;
        int two = 2;
        int three = 3;

        boolean a = one > two && one > three;
        boolean b = two > one && two > three;
        boolean c = three > two && one < three;

        if (a) {
            System.out.println("Переменная one наибольшая");
            }
        if (b) {
            System.out.println("Переменная two наибольшая");
            }
        if (c) {
            System.out.println("Переменная three наибольшая");
            }
        else {
            System.out.println("Какие-то переменные равны");
        }

        //не совсем пока разобрался с оператором else
    }
}