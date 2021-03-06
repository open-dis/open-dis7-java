package edu.nps.moves.dis7.entities.oth.environmental.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@29c59b6e;
 * Country: Other;
 * Entity kind: Environmental;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 21933
 */
public class CurrentProfile extends EntityType
{
    /** Default constructor */
    public CurrentProfile()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.ENVIRONMENTAL);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 21933, Current Profile
    }
}
