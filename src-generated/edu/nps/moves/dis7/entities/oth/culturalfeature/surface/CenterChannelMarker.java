package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@43ab9ae9
 * Country: Other
 * Entity kind: Cultural feature
 * Domain: SURFACE
 *
 * Entity type uid: 22140
 */
public class CenterChannelMarker extends EntityType
{
    public CenterChannelMarker()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 22139, Marker
        setSubCategory((byte)1); // uid 22140, Center Channel Marker
    }
}
