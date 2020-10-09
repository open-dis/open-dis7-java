package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@77e80a5e
 * Country: Other
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 24623
 */
public class GenericReeferShipRefrigeratorShip extends EntityType
{
    public GenericReeferShipRefrigeratorShip()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24619, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)4); // uid 24623, Generic Reefer Ship (Refrigerator Ship)
    }
}
