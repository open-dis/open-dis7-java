package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@37a0ec3c;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11493
 */
public class DD929ShaoYangexHollisterDD788Taiwan extends EntityType
{
    /** Default constructor */
    public DD929ShaoYangexHollisterDD788Taiwan()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 11456, Destroyer
        setSubCategory((byte)3); // uid 11490, Gearing (Wu Chin III Conversion) (FRAM I) Class
        setSpecific((byte)3); // uid 11493, DD 929 Shao Yang (ex. Hollister DD 788) (Taiwan)
    }
}
