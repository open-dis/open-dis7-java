package edu.nps.moves.dis7.entities.rus.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@734ce281;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 20431
 */
public class SpigotA extends EntityType
{
    /** Default constructor */
    public SpigotA()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 20421, Guided
        setSubCategory((byte)6); // uid 20430, AT-4 Spigot
        setSpecific((byte)1); // uid 20431, Spigot A
    }
}
