package edu.nps.moves.dis7.entities.rus.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6568f998;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 20358
 */
public class SA8Bmod1 extends EntityType
{
    /** Default constructor */
    public SA8Bmod1()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 20301, Guided
        setSubCategory((byte)20); // uid 20356, SA-8 Gecko
        setSpecific((byte)2); // uid 20358, SA-8B mod 1
    }
}
