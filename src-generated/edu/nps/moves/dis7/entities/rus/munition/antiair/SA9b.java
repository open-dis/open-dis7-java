package edu.nps.moves.dis7.entities.rus.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@37314843;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 23926
 */
public class SA9b extends EntityType
{
    /** Default constructor */
    public SA9b()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 20301, Guided
        setSubCategory((byte)21); // uid 20359, SA-9 Gaskin
        setSpecific((byte)2); // uid 23926, SA-9b
    }
}
