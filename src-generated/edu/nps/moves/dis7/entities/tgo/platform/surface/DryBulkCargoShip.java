package edu.nps.moves.dis7.entities.tgo.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6b1dc20f;
 * Country: Togo (TGO);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24594
 */
public class DryBulkCargoShip extends EntityType
{
    /** Default constructor */
    public DryBulkCargoShip()
    {
        setCountry(Country.TOGO_TGO);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24593, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)2); // uid 24594, Dry Bulk Cargo Ship
    }
}
