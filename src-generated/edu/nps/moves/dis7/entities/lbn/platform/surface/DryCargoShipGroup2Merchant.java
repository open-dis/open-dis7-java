package edu.nps.moves.dis7.entities.lbn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6ea1bcdc;
 * Country: Lebanon (LBN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24451
 */
public class DryCargoShipGroup2Merchant extends EntityType
{
    /** Default constructor */
    public DryCargoShipGroup2Merchant()
    {
        setCountry(Country.LEBANON_LBN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24451, Dry Cargo Ship (Group 2 Merchant)
    }
}
