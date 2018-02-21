package by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.Manufacturer;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.EngineType.ElectraCar;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.EngineType.OilCar;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.Core.Type;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.Core.WorkClass;

public class Nissan extends WorkClass {
    public void create() {
        showRoom.addCar(new OilCar("Nissan", "Juke", 750, 175, 3, Type.CROSSOVER, true, 57));
        showRoom.addCar(new OilCar("Nissan", "GT-R", 1500, 300, 4, Type.SPORTSCAR, false, 50));
        showRoom.addCar(new OilCar("Nissan", "Qashqai", 1250, 200, 5, Type.CROSSOVER, true, 75));
        showRoom.addCar(new OilCar("Nissan", "Almera", 1000, 185, 5, Type.SEDAN, true, 60));
        showRoom.addCar(new ElectraCar("Nissan", "Terrano", 1000, 185, 5, Type.CROSSOVER, true, 10, 5600, 500, 100));
        showRoom.addCar(new OilCar("Nissan", "X-trail", 1000, 185, 5, Type.CROSSOVER, true, 60));
        showRoom.setName("Nissan");
    }
}