package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5a4ed68f
 * Country: Other
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 30882
 */
public class GenericLifebuoywithLightandSmoke extends EntityType
{
    public GenericLifebuoywithLightandSmoke()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)101); // uid 30867, Life-Saving Equipment
        setSubCategory((byte)4); // uid 30878, Generic Lifebuoy
        setSpecific((byte)4); // uid 30882, Generic Lifebuoy with Light and Smoke
    }
}
