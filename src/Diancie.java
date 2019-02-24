import moves.Facade;
import moves.RockTomb;
import ru.ifmo.se.pokemon.*;


class Diancie extends Pokemon {

    Diancie(String var1, int var2) {
        super(var1, var2);
        setStats(50, 100, 150, 100, 150, 50);
        setType(Type.ROCK, Type.FAIRY);
        setMove(new RockTomb(), new Facade());
    }
}
