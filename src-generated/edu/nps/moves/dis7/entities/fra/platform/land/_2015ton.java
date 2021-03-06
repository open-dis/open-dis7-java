package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@11c9af63;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 15686
 */
public class _2015ton extends EntityType
{
    /** Default constructor */
    public _2015ton()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 15683, Cargo Trailer
        setSubCategory((byte)3); // uid 15686, 2.01 - 5 ton
    }
}
