package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

import static java.lang.Double.POSITIVE_INFINITY;

public class AerialAce extends PhysicalMove {
    public AerialAce(){
        super(Type.FLYING, 60, POSITIVE_INFINITY);
    }
}
