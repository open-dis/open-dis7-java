package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@456be73c;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 12559
 */
public class T54M extends EntityType
{
    /** Default constructor */
    public T54M()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 12510, Tank
        setSubCategory((byte)5); // uid 12554, T-54 MBT
        setSpecific((byte)5); // uid 12559, T-54M
    }
}
