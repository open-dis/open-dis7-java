package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3aaa3c39
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 10513
 */
public class MTV extends EntityType
{
    public MTV()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)13); // uid 10511, TTC FMTV
        setSpecific((byte)2); // uid 10513, MTV
    }
}
