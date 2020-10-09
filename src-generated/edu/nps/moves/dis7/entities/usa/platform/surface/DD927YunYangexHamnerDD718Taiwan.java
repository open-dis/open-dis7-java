package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@77b3752b
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 11497
 */
public class DD927YunYangexHamnerDD718Taiwan extends EntityType
{
    public DD927YunYangexHamnerDD718Taiwan()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 11456, Destroyer
        setSubCategory((byte)3); // uid 11490, Gearing (Wu Chin III Conversion) (FRAM I) Class
        setSpecific((byte)7); // uid 11497, DD 927 Yun Yang (ex. Hamner DD 718 ) (Taiwan)
    }
}
