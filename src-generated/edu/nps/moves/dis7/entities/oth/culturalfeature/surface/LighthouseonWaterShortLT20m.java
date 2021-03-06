package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@42f9873e;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: SURFACE;
 *
 * Entity type uid: 29795
 */
public class LighthouseonWaterShortLT20m extends EntityType
{
    /** Default constructor */
    public LighthouseonWaterShortLT20m()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 22139, Marker
        setSubCategory((byte)4); // uid 29794, Lighthouse on Water
        setSpecific((byte)1); // uid 29795, Lighthouse on Water, Short (<20m)
    }
}
