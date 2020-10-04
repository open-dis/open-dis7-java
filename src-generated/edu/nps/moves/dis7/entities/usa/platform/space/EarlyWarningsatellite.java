package edu.nps.moves.dis7.entities.usa.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5600a5da
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SPACE
 *
 * Entity type uid: 12446
 */
public class EarlyWarningsatellite extends EntityType
{
    public EarlyWarningsatellite()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 12431, Unmanned
        setSubCategory((byte)3); // uid 12446, Early Warning satellite
    }
}