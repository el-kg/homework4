public class Main {
    public static void main(String[] args) {
        // задача 1
        int age = 16;
         if (age >= 18) {
         System.out.println("Если возраст человека равен " + age + " ,то  он совершеннолетний");
        } else {
         System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        // задача 2
         int temp = 7;
         if (temp <= 5) {
          System.out.println("На улице " + temp + " градусов, нужно надеть шапку ");
         } else {
          System.out.println("На улице " + temp + " градусов, можно идти без шапки");
         }
        // задача 3
        int speed = 54;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф ");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно");
        }
        // задача 4
        int manAge = 64;
        if (manAge < 2) {
            System.out.println("Если возраст человека равен " + manAge +" то ему пора спать.");
        }
        if (manAge >=2 && manAge <=6) {
            System.out.println("Если возраст человека равен " + manAge +" то ему нужно ходить в детский сад.");
        }
        if (manAge >=7 && manAge <18) {
            System.out.println("Если возраст человека равен " + manAge +" то ему нужно ходить в школу.");
        }
        if (manAge >=18 && manAge <24) {
            System.out.println("Если возраст человека равен " + manAge +" то его место в университете.");
        }
        if (manAge >=24 && manAge <60) {
            System.out.println("Если возраст человека равен " + manAge +" то ему пора ходить на работу.");
        }
        if (manAge >=60) {
            System.out.println("Если возраст человека равен " + manAge +" то он может отдохнуть.");
        }
        // задача 5
        int chlildAge = 16;
        if (chlildAge < 5) {
            System.out.println("Если возраст ребенка равен " + chlildAge +" то он не может кататься на аттракционе.");
        }
        if (chlildAge >= 5 && chlildAge < 14) {
            System.out.println("Если возраст ребенка равен " + chlildAge +" то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (chlildAge >= 14) {
            System.out.println("Если возраст ребенка равен " + chlildAge +" то он может кататься без сопровождения взрослого.");
        }
        // задача 6
        int seatPlace = 60;
        int standingPlace = 62;
        int buingSeatPlace = 60;
        int buingStandingPlace = 62;
        if (buingSeatPlace < 60 || buingStandingPlace < 62) {
            System.out.println("В вагоне осталось " + (seatPlace - buingSeatPlace) + " сидячих мест и "  + (standingPlace - buingStandingPlace) + " стоячих мест");
        } else {
            System.out.println("В вагоне не осталось свободных мест!");
        }
        // задача 7
        int one = 74;
        int two = 51;
        int three = 22;
        if (one > two && one > three) {
            System.out.println("one самое большое число! " + one );
        } else {
            if (two > one && two > three){
                System.out.println("two самое большое число! "+ two);
            }else {
                System.out.println("three самое большое число! " + three);
            }
        }



    }
}