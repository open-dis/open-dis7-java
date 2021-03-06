package edu.nps.moves.dis7.entities.mmr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@687a762c;
 * Country: Myanmar (MMR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26767
 */
public class JianghuIIClassType053H1 extends EntityType
{
    /** Default constructor */
    public JianghuIIClassType053H1()
    {
        setCountry(Country.MYANMAR_MMR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 26766, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 26767, Jianghu-II Class (Type 053H1)
    }
}
