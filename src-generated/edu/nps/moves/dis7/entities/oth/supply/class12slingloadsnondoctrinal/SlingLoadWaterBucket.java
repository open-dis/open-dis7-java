package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@37d3aa8c;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_12_SLING_LOADS_NON_DOCTRINAL;
 *
 * Entity type uid: 30825
 */
public class SlingLoadWaterBucket extends EntityType
{
    /** Default constructor */
    public SlingLoadWaterBucket()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)4); // uid 30825, Sling Load, Water Bucket
    }
}
