import java.util.Iterator;
import java.util.List;

public class Fox extends Animal {
    private int energy;

    public Fox(boolean randomAge,Field field, Location location) {
        super(randomAge,field, location);
        if (randomAge) {
            energy = rand.nextInt(10);
        } else {
            energy = 10;
        }
    }

    @Override
    public void act(List<Animal> newAnimals) {
        incrementAge();
        incrementHunger();
        if (isAlive()) {
            giveBirth(newAnimals);
            Location newLocation = findFood();
            if (newLocation == null) {
                newLocation = field.getFreeAdjacentLocations(location);
            }

            if (newLocation != null) {
                setLocation(newLocation);
            } else {
                setDead();
            }
        }
    }

    private void incrementHunger() {
        energy--;
        if (energy <= 0) {
            setDead();
        }
    }

    private Location findFood() {
        List<Location> adjacent = field.adjacentLocations(location);
        Iterator<Location> it = adjacent.iterator();
        while (it.hasNext()) {
            Location where = it.next();
            Object animal = field.getObjectAt(where);
            if (animal instanceof Rabbit) {
                Rabbit rabbit = (Rabbit) animal;
                if (rabbit.isAlive()) {
                    rabbit.setDead();
                    energy = 10;
                    return where;
                }
            }
        }
        return null;
    }

    @Override
    protected int getMaxAge() {
        return 10;
    }

    @Override
    protected int getBreedingAge() {
        return 2;
    }

    @Override
    protected double getBreedingProbability() {
        return 0.08;
    }

    @Override
    protected int getMaxLitterSize() {
        return 2;
    }

    @Override
    protected Animal createYoung(Field field, Location location) {
        return new Fox(false,field, location);
    }
}