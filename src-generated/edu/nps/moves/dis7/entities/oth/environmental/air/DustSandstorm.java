package edu.nps.moves.dis7.entities.oth.environmental.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@29d3d0fb;
 * Country: Other;
 * Entity kind: Environmental;
 * Domain: AIR;
 *
 * Entity type uid: 21919
 */
public class DustSandstorm extends EntityType
{
    /** Default constructor */
    public DustSandstorm()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.ENVIRONMENTAL);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 21919, Dust/Sandstorm
    }
}
