package edu.nps.moves.dis7.entities.sgp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@e042c99;
 * Country: Singapore (SGP);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28173
 */
public class MVAvatar extends EntityType
{
    /** Default constructor */
    public MVAvatar()
    {
        setCountry(Country.SINGAPORE_SGP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 28171, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)2); // uid 28172, Dry Bulk Cargo Ship
        setSpecific((byte)1); // uid 28173, M V Avatar
    }
}
