package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7e1a9173;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_12_SLING_LOADS_NON_DOCTRINAL;
 *
 * Entity type uid: 30847
 */
public class SlingLoadCollapsible5000Gal extends EntityType
{
    /** Default constructor */
    public SlingLoadCollapsible5000Gal()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)7); // uid 30844, Sling Load, Collapsible
        setSubCategory((byte)3); // uid 30847, Sling Load, Collapsible, 5000 Gal
    }
}
