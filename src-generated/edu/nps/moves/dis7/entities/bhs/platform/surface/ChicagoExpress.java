package edu.nps.moves.dis7.entities.bhs.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3498ed;
 * Country: Bahamas (BHS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24484
 */
public class ChicagoExpress extends EntityType
{
    /** Default constructor */
    public ChicagoExpress()
    {
        setCountry(Country.BAHAMAS_BHS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24482, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)3); // uid 24483, Container Ship
        setSpecific((byte)1); // uid 24484, Chicago Express
    }
}
