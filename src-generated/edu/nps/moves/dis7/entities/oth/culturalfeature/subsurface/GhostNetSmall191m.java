package edu.nps.moves.dis7.entities.oth.culturalfeature.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@269308cc;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 25211
 */
public class GhostNetSmall191m extends EntityType
{
    /** Default constructor */
    public GhostNetSmall191m()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)4); // uid 25210, Ghost Net
        setSubCategory((byte)1); // uid 25211, Ghost Net, Small (1-91m)
    }
}
