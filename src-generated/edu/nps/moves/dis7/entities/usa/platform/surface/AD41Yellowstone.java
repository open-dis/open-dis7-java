package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4e424582;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11960
 */
public class AD41Yellowstone extends EntityType
{
    /** Default constructor */
    public AD41Yellowstone()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)53); // uid 11956, Destroyer Tender
        setSubCategory((byte)1); // uid 11957, Sam Gompers/Yellowstone Class
        setSpecific((byte)3); // uid 11960, AD 41 Yellowstone
    }
}
