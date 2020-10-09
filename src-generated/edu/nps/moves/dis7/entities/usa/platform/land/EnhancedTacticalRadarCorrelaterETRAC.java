package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@69909c14
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 23515
 */
public class EnhancedTacticalRadarCorrelaterETRAC extends EntityType
{
    public EnhancedTacticalRadarCorrelaterETRAC()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)31); // uid 10741, Intelligence Facility
        setSubCategory((byte)8); // uid 23515, Enhanced Tactical Radar Correlater (ETRAC)
    }
}
