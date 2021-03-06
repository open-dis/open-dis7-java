package edu.nps.moves.dis7.entities.oth.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@2516fc68;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 29695
 */
public class SemiSubmersibleBoats extends EntityType
{
    /** Default constructor */
    public SemiSubmersibleBoats()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)82); // uid 29695, Semi-Submersible Boats
    }
}
