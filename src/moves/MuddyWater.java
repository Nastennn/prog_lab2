package moves;

import ru.ifmo.se.pokemon.*;

public class MuddyWater extends SpecialMove {
    public MuddyWater(){
        super(Type.WATER, 90, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random()<=0.3) pokemon.setMod(Stat.ACCURACY, -1);
    }
}
