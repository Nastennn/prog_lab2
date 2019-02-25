package Pokemon;

import moves.Confusion;
import moves.DoubleTeam;
import moves.Facade;
import moves.Slash;
import ru.ifmo.se.pokemon.Type;

public class Swampert extends Marshtomp {
    public Swampert(String name, int level){
        super(name,level);
        setStats(100,110,90,85,90,60);
        setType(Type.WATER,Type.GROUND);
        setMove(new Facade(), new DoubleTeam(),new Slash(),new Confusion());
    }
}
