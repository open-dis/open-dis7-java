package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@b0d3e7;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 22110
 */
public class RoadSectionCurvedFourLane extends EntityType
{
    /** Default constructor */
    public RoadSectionCurvedFourLane()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)20); // uid 22100, Road element
        setSubCategory((byte)2); // uid 22106, Road Section Curved
        setSpecific((byte)4); // uid 22110, Road Section Curved, Four Lane
    }
}
