package edu.nps.moves.dis7.entities.oth.environmental.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@7540160e;
 * Country: Other;
 * Entity kind: Environmental;
 * Domain: AIR;
 *
 * Entity type uid: 21913
 */
public class Smoke extends EntityType
{
    /** Default constructor */
    public Smoke()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.ENVIRONMENTAL);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 21913, Smoke
    }
}
