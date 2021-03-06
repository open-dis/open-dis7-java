package edu.nps.moves.dis7.entities.nld.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3277e499;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 18930
 */
public class CRC extends EntityType
{
    /** Default constructor */
    public CRC()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)23); // uid 18929, Warning System
        setSubCategory((byte)1); // uid 18930, CRC
    }
}
