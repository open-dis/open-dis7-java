package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@769bd849
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 25271
 */
public class M1098WaterTrailer5000gal extends EntityType
{
    public M1098WaterTrailer5000gal()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)17); // uid 10633, Water trailer
        setSubCategory((byte)2); // uid 10636, 1001- 5000 gallons
        setSpecific((byte)2); // uid 25271, M1098 Water Trailer (5000 gal)
    }
}
