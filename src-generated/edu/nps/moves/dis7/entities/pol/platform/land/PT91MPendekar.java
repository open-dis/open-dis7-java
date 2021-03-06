package edu.nps.moves.dis7.entities.pol.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4b61d0c6;
 * Country: Poland (POL);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25545
 */
public class PT91MPendekar extends EntityType
{
    /** Default constructor */
    public PT91MPendekar()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 25540, Tank
        setSubCategory((byte)1); // uid 25541, PT-91 Twardy Main Battle Tank
        setSpecific((byte)4); // uid 25545, PT-91M Pendekar
    }
}
