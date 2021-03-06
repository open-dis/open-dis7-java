package edu.nps.moves.dis7.entities.pak.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@70fede7d;
 * Country: Pakistan (PAK);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 29049
 */
public class HatfVIIIHaft8Raad extends EntityType
{
    /** Default constructor */
    public HatfVIIIHaft8Raad()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 29047, Guided
        setSubCategory((byte)2); // uid 29049, Hatf-VIII / Haft-8 (Raad)
    }
}
