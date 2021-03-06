package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3fc79729;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16460
 */
public class BredstedtclasslargepatrolcraftCoastGuardvessels extends EntityType
{
    /** Default constructor */
    public BredstedtclasslargepatrolcraftCoastGuardvessels()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 16416, Light/patrol craft
        setSubCategory((byte)4); // uid 16460, Bredstedt class (large patrol craft, Coast Guard vessels)
    }
}
