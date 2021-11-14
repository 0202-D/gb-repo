package Lesson_1;

public class Main {
    public static void main(String[] args) {
        Participants[] participants = {new Robot("T-1000"), new Cat("Tom"), new Human("Ivan")};
        Obstacles[] obstacles = {new RunningRoad(500), new Wall(2), new RunningRoad(1500), new Wall(5)};
        for (Participants participant : participants) {
            for (Obstacles obstacle : obstacles) {
                if (!participant.isDid()) {
                    System.out.println(participant.getName()+" failed!");
                    break;
                }
                obstacle.passingThrough(participant);
            }
          if(participant.isDid()) { System.out.println(participant.getName()+" - the competition has ended!!!");}
            System.out.println();


        }

    }
}


