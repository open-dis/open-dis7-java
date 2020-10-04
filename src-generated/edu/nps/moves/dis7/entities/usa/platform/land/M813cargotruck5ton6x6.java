package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4cb702ce
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 10532
 */
public class M813cargotruck5ton6x6 extends EntityType
{
    public M813cargotruck5ton6x6()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)16); // uid 10532, M813 cargo truck, 5-ton, 6x6
    }
}
