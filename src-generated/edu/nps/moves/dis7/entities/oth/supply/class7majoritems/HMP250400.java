package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1ad1b737;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_7_MAJOR_ITEMS;
 *
 * Entity type uid: 30744
 */
public class HMP250400 extends EntityType
{
    /** Default constructor */
    public HMP250400()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)9); // uid 30622, M - Weapons
        setSubCategory((byte)1); // uid 30744, HMP-250/400
    }
}
