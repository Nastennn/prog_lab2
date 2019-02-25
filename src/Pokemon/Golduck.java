package Pokemon;

import moves.AerialAce;
import moves.Facade;
import moves.FocusBlast;
import moves.Swagger;
import ru.ifmo.se.pokemon.Type;

public class Golduck extends Psyduck {
    public Golduck(String name, int level){
        super(name,level);
        setStats(80,82,78,95,80,85);
        setType(Type.WATER);
        setMove(new Facade(), new AerialAce(),new Swagger(),new FocusBlast());
    }
}
