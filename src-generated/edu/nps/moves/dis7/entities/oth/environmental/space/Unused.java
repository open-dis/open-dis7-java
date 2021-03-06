package edu.nps.moves.dis7.entities.oth.environmental.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@5871a482;
 * Country: Other;
 * Entity kind: Environmental;
 * Domain: SPACE;
 *
 * Entity type uid: 21942
 */
public class Unused extends EntityType
{
    /** Default constructor */
    public Unused()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.ENVIRONMENTAL);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)0); // uid 21942, Unused
    }
}
