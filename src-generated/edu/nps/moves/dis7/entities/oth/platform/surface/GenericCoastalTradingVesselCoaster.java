package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@79c5636f;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24631
 */
public class GenericCoastalTradingVesselCoaster extends EntityType
{
    /** Default constructor */
    public GenericCoastalTradingVesselCoaster()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24627, Tanker (Group 3 Merchant)
        setSubCategory((byte)4); // uid 24631, Generic Coastal Trading Vessel (Coaster)
    }
}
