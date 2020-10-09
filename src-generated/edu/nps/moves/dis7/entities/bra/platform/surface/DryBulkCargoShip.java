package edu.nps.moves.dis7.entities.bra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4566e5bd
 * Country: Brazil (BRA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 31999
 */
public class DryBulkCargoShip extends EntityType
{
    public DryBulkCargoShip()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 31880, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)2); // uid 31999, Dry Bulk Cargo Ship
    }
}
