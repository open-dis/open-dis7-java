package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@40bf4386;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11818
 */
public class TAK30031stLtAlexanderBonnymanJr extends EntityType
{
    /** Default constructor */
    public TAK30031stLtAlexanderBonnymanJr()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 11770, Auxiliary, Merchant Marine
        setSubCategory((byte)9); // uid 11814, Maritime Prepositioning Ships (MPS)
        setSpecific((byte)4); // uid 11818, TAK 3003 1st Lt Alexander Bonnyman Jr.
    }
}
