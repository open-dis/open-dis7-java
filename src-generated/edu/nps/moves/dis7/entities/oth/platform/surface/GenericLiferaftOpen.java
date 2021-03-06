package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3003697;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30873
 */
public class GenericLiferaftOpen extends EntityType
{
    /** Default constructor */
    public GenericLiferaftOpen()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)101); // uid 30867, Life-Saving Equipment
        setSubCategory((byte)2); // uid 30872, Generic Liferaft
        setSpecific((byte)1); // uid 30873, Generic Liferaft Open
    }
}
