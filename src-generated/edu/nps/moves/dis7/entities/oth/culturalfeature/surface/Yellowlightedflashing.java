package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59371066;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: SURFACE;
 *
 * Entity type uid: 22131
 */
public class Yellowlightedflashing extends EntityType
{
    /** Default constructor */
    public Yellowlightedflashing()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)2); // uid 22125, Buoy
        setSubCategory((byte)1); // uid 22126, Lighted buoy
        setSpecific((byte)5); // uid 22131, Yellow lighted (flashing)
    }
}
