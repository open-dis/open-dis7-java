package edu.nps.moves.dis7.entities.qat.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6f8d7714
 * Country: Qatar (QAT)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17842
 */
public class FaireyMarineSpearClasscoastalpatrolcraft extends EntityType
{
    public FaireyMarineSpearClasscoastalpatrolcraft()
    {
        setCountry(Country.QATAR_QAT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17828, Light/Patrol Craft
        setSubCategory((byte)4); // uid 17842, Fairey Marine Spear Class (coastal patrol craft)
    }
}
