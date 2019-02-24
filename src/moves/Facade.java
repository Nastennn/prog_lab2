package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
     public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe() {
        return "дает леща";
    }


    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        if (pokemon.getCondition() == Status.BURN || pokemon.getCondition() == Status.POISON || pokemon.getCondition() == Status.PARALYZE) {
            super.applyOppDamage(pokemon, damage * 2);
        } else {
            super.applyOppDamage(pokemon, damage);
        }
    }
}
