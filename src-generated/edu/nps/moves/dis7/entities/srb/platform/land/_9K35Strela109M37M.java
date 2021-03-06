package edu.nps.moves.dis7.entities.srb.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@381d7219;
 * Country: Serbia (SRB);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 30167
 */
public class _9K35Strela109M37M extends EntityType
{
    /** Default constructor */
    public _9K35Strela109M37M()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 30166, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 30167, 9K35 Strela-10 9M37M
    }
}
