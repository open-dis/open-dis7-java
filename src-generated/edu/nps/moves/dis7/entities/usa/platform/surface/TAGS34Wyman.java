package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@db99785;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11891
 */
public class TAGS34Wyman extends EntityType
{
    /** Default constructor */
    public TAGS34Wyman()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 11770, Auxiliary, Merchant Marine
        setSubCategory((byte)20); // uid 11885, Surveying Ships (Special Mission Support)
        setSpecific((byte)6); // uid 11891, TAGS 34 Wyman
    }
}
