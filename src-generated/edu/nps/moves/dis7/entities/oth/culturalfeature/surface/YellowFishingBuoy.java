package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1073c664;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: SURFACE;
 *
 * Entity type uid: 27178
 */
public class YellowFishingBuoy extends EntityType
{
    /** Default constructor */
    public YellowFishingBuoy()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)2); // uid 22125, Buoy
        setSubCategory((byte)7); // uid 27174, Fishing Buoys
        setSpecific((byte)4); // uid 27178, Yellow Fishing Buoy
    }
}
