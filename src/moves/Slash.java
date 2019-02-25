package moves;

import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove {
    public Slash(){
        super(Type.NORMAL, 70,100);
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        if ((pokemon.getStat(Stat.SPEED))*2 / 512.0D > Math.random()) {
            System.out.println("Critical hit");
            return 2.0D;
        } else {
            return 1.0D;
        }
    }
}
