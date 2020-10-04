package edu.nps.moves.dis7.entities.sau.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2af4129d
 * Country: Saudi Arabia (SAU)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17867
 */
public class HalterTypecoastalpatrolcraft extends EntityType
{
    public HalterTypecoastalpatrolcraft()
    {
        setCountry(Country.SAUDI_ARABIA_SAU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17862, Light/Patrol Craft
        setSubCategory((byte)2); // uid 17867, Halter Type (coastal patrol craft)
    }
}