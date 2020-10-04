package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@47162173
 * Country: Other
 * Entity kind: Supply
 * Domain: CLASS_12_SLING_LOADS_NON_DOCTRINAL
 *
 * Entity type uid: 30851
 */
public class SlingLoadBladder5000Gal extends EntityType
{
    public SlingLoadBladder5000Gal()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)8); // uid 30849, Sling Load, Bladder
        setSubCategory((byte)2); // uid 30851, Sling Load, Bladder, 5000 Gal
    }
}
