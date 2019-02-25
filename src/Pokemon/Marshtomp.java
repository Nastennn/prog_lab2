package Pokemon;

import moves.DoubleTeam;
import moves.Facade;
import moves.Slash;
import ru.ifmo.se.pokemon.Type;

public class Marshtomp extends Mudkip {
    public Marshtomp(String name,int level){
        super(name,level);
        setStats(70,85,70,60,70,50);
        setType(Type.WATER,Type.GROUND);
        setMove(new Facade(),new DoubleTeam(),new Slash());
    }
}
