package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@27443560
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 33017
 */
public class M107WaterTrailer400gal extends EntityType
{
    public M107WaterTrailer400gal()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)17); // uid 10633, Water trailer
        setSubCategory((byte)1); // uid 10634, 1-1000 gallons
        setSpecific((byte)3); // uid 33017, M107 Water Trailer (400 gal)
    }
}
