package edu.nps.moves.dis7.entities.oth.supply.class11suppliesnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@186481d4;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_11_SUPPLIES_NON_DOCTRINAL;
 *
 * Entity type uid: 30810
 */
public class Pallets extends EntityType
{
    /** Default constructor */
    public Pallets()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_11_SUPPLIES_NON_DOCTRINAL));

        setCategory((byte)2); // uid 30810, Pallets
    }
}
