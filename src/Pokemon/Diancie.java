package Pokemon;

import moves.Facade;
import moves.MuddyWater;
import moves.RockTomb;
import moves.Swagger;
import ru.ifmo.se.pokemon.*;


public class Diancie extends Pokemon {
    public Diancie(String name, int level) {
        super(name, level);
        setStats(50, 100, 150, 100, 150, 50);
        setType(Type.ROCK, Type.FAIRY);
        setMove(new RockTomb(), new Facade(), new Swagger(), new MuddyWater());
    }
}
