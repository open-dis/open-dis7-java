package edu.nps.moves.dis7.entities.oth.supply.class11suppliesnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@75a226ea;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_11_SUPPLIES_NON_DOCTRINAL;
 *
 * Entity type uid: 30813
 */
public class PalletsofFuelJP8 extends EntityType
{
    /** Default constructor */
    public PalletsofFuelJP8()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_11_SUPPLIES_NON_DOCTRINAL));

        setCategory((byte)2); // uid 30810, Pallets
        setSubCategory((byte)3); // uid 30813, Pallets of Fuel (JP8)
    }
}
