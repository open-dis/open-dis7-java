package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6210666c;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 22056
 */
public class _1storyHousewithFireplace extends EntityType
{
    /** Default constructor */
    public _1storyHousewithFireplace()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 22040, Camp Lejeune MOUT Collective Training Facility (CTF)
        setSubCategory((byte)3); // uid 22054, Residential Building
        setSpecific((byte)2); // uid 22056, 1-story House with Fireplace
    }
}
