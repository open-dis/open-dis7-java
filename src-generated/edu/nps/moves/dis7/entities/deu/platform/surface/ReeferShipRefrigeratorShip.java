package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@479460a6;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27587
 */
public class ReeferShipRefrigeratorShip extends EntityType
{
    /** Default constructor */
    public ReeferShipRefrigeratorShip()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 27585, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)4); // uid 27587, Reefer Ship (Refrigerator Ship)
    }
}
