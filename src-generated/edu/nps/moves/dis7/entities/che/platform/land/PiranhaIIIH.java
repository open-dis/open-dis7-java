package edu.nps.moves.dis7.entities.che.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f1d0bbc
 * Country: Switzerland (CHE)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 32948
 */
public class PiranhaIIIH extends EntityType
{
    public PiranhaIIIH()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 32943, Armored Fighting Vehicle
        setSubCategory((byte)3); // uid 32946, Piranha III
        setSpecific((byte)2); // uid 32948, Piranha IIIH
    }
}