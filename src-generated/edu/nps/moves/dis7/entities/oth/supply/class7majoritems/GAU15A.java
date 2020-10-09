package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b8d20e6
 * Country: Other
 * Entity kind: Supply
 * Domain: CLASS_7_MAJOR_ITEMS
 *
 * Entity type uid: 30630
 */
public class GAU15A extends EntityType
{
    public GAU15A()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)9); // uid 30622, M - Weapons
        setSubCategory((byte)4); // uid 30629, 12.7 mm/.50 caliber
        setSpecific((byte)1); // uid 30630, GAU-15/A
    }
}
