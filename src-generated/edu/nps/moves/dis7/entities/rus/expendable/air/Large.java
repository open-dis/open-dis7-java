package edu.nps.moves.dis7.entities.rus.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1f3c5308;
 * Country: Russia (RUS);
 * Entity kind: Expendable;
 * Domain: AIR;
 *
 * Entity type uid: 22297
 */
public class Large extends EntityType
{
    /** Default constructor */
    public Large()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 22290, Chaff
        setSubCategory((byte)1); // uid 22291, Bundle
        setSpecific((byte)4); // uid 22297, Large
    }
}
