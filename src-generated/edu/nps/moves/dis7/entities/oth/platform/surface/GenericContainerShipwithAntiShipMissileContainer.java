package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4943defe;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30587
 */
public class GenericContainerShipwithAntiShipMissileContainer extends EntityType
{
    /** Default constructor */
    public GenericContainerShipwithAntiShipMissileContainer()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24619, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)3); // uid 24622, Generic Container Ship
        setSpecific((byte)1); // uid 30587, Generic Container Ship - with Anti-Ship Missile Container
    }
}
