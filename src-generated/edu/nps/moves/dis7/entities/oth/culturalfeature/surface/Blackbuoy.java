package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3c544c9;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: SURFACE;
 *
 * Entity type uid: 22133
 */
public class Blackbuoy extends EntityType
{
    /** Default constructor */
    public Blackbuoy()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)2); // uid 22125, Buoy
        setSubCategory((byte)2); // uid 22132, Can
        setSpecific((byte)1); // uid 22133, Black buoy
    }
}
