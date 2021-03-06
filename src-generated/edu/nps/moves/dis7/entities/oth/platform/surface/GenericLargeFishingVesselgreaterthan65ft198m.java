package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7da10b5b;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24653
 */
public class GenericLargeFishingVesselgreaterthan65ft198m extends EntityType
{
    /** Default constructor */
    public GenericLargeFishingVesselgreaterthan65ft198m()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)86); // uid 24650, Fishing Vessel
        setSubCategory((byte)3); // uid 24653, Generic Large Fishing Vessel (greater than 65ft/19.8m)
    }
}
