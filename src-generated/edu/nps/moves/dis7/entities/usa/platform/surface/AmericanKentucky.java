package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@25974207;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24395
 */
public class AmericanKentucky extends EntityType
{
    /** Default constructor */
    public AmericanKentucky()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24393, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)3); // uid 24394, Container Ship
        setSpecific((byte)1); // uid 24395, American Kentucky
    }
}
