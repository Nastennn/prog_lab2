import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import Pokemon.*;

public class Main{
    public static void main(String[] args){
        Battle b = new Battle();
        Psyduck p1 = new Psyduck("Psyduck", 2);
        Diancie p2 = new Diancie("Diancie", 1);
        Golduck p3 = new Golduck("Golduck",36);
        Mudkip p4 = new Mudkip("Mudkip",3);
        Marshtomp p5 = new Marshtomp("Marshtomp", 5);
        Swampert p6 = new Swampert("Swampert", 32);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }
}

