package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4b432e53;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 26022
 */
public class CaterpillarModel621G extends EntityType
{
    /** Default constructor */
    public CaterpillarModel621G()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)87); // uid 26009, Construction Specialty Vehicle
        setSubCategory((byte)22); // uid 26021, Scraper
        setSpecific((byte)1); // uid 26022, Caterpillar Model 621G
    }
}
