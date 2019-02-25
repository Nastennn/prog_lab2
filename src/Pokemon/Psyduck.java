package Pokemon;

import moves.AerialAce;
import moves.Facade;
import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Psyduck extends Pokemon {
    public Psyduck(String name, int level){
        super(name,level);
        setStats(50,52,48,65,50,55);
        setType(Type.WATER);
        setMove(new Facade(),new AerialAce(),new Swagger());
    }

}
