package edu.nps.moves.dis7.entities.pak.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5f233b26;
 * Country: Pakistan (PAK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28250
 */
public class Moawin extends EntityType
{
    /** Default constructor */
    public Moawin()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 19343, Auxiliary
        setSubCategory((byte)3); // uid 28249, Poolster Class
        setSpecific((byte)1); // uid 28250, Moawin
    }
}
