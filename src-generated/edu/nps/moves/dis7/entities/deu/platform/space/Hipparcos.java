package edu.nps.moves.dis7.entities.deu.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@265adfad;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SPACE;
 *
 * Entity type uid: 16836
 */
public class Hipparcos extends EntityType
{
    /** Default constructor */
    public Hipparcos()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 16811, Unmanned
        setSubCategory((byte)13); // uid 16824, Science satellite
        setSpecific((byte)12); // uid 16836, Hipparcos
    }
}
