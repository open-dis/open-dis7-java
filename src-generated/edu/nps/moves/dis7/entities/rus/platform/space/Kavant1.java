package edu.nps.moves.dis7.entities.rus.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3dd818e8
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: SPACE
 *
 * Entity type uid: 14823
 */
public class Kavant1 extends EntityType
{
    public Kavant1()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)0); // uid 14821, Other
        setSubCategory((byte)1); // uid 14822, Astronomical Module
        setSpecific((byte)1); // uid 14823, Kavant 1
    }
}
