package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3252747e;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10523
 */
public class M291vanexpansible extends EntityType
{
    /** Default constructor */
    public M291vanexpansible()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)14); // uid 10514, M54 6x6 5-ton cargo truck series
        setSpecific((byte)9); // uid 10523, M291, van, expansible
    }
}
