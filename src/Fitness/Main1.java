package Fitness;

import java.util.Date;

public class Main1 {
    public static void main(String[] args) {
        FitnessClub fitnessClub = new FitnessClub();

        visitors visitor1 = new visitors("Алексей", "Лашков", 2006);
        visitors visitor2 = new visitors("Егор", "Титов", 2006);
        visitors visitor3 = new visitors("Виталий", "Флавьянов", 2006);
        visitors visitor4 = new visitors("Иван", "Захаров", 2006);

        Abonement dailyAbonement = new Abonement(visitor1, new Date(), new Date(new Date().getTime() + 24 * 60 * 60 * 1000));
        Abonement fullAbonement = new Abonement(visitor2, new Date(), new Date(new Date().getTime() + 30 * 24 * 60 * 60 * 1000));

        fitnessClub.visit(visitor1, dailyAbonement, "pool");
        fitnessClub.visit(visitor2, fullAbonement, "gym");
        fitnessClub.visit(visitor3, fullAbonement, "group");
        fitnessClub.visit(visitor4, fullAbonement, "treadmill");
    }
}
