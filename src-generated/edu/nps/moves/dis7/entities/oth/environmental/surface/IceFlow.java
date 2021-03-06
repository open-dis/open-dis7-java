package edu.nps.moves.dis7.entities.oth.environmental.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@1a6dc5ea;
 * Country: Other;
 * Entity kind: Environmental;
 * Domain: SURFACE;
 *
 * Entity type uid: 25214
 */
public class IceFlow extends EntityType
{
    /** Default constructor */
    public IceFlow()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.ENVIRONMENTAL);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 25214, Ice Flow
    }
}
