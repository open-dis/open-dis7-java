package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@38fb151a;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: SURFACE;
 *
 * Entity type uid: 27180
 */
public class HighFlyerFishingBuoyRadarReflector extends EntityType
{
    /** Default constructor */
    public HighFlyerFishingBuoyRadarReflector()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)2); // uid 22125, Buoy
        setSubCategory((byte)7); // uid 27174, Fishing Buoys
        setSpecific((byte)6); // uid 27180, High Flyer Fishing Buoy (Radar Reflector)
    }
}
