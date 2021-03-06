package edu.nps.moves.dis7.entities.srb.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4743a322;
 * Country: Serbia (SRB);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 30165
 */
public class FAP2026 extends EntityType
{
    /** Default constructor */
    public FAP2026()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 30163, Large Wheeled Utility Vehicle
        setSubCategory((byte)2); // uid 30165, FAP 2026
    }
}
