package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@26f75d9c;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 30442
 */
public class AircraftWreckage extends EntityType
{
    /** Default constructor */
    public AircraftWreckage()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)31); // uid 30442, Aircraft Wreckage
    }
}
