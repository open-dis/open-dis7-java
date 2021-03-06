package edu.nps.moves.dis7.entities.pak.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d868997;
 * Country: Pakistan (PAK);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 27246
 */
public class S134Ghazi extends EntityType
{
    /** Default constructor */
    public S134Ghazi()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 27234, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)3); // uid 27242, Hangor / Daphne Class
        setSpecific((byte)4); // uid 27246, S134 Ghazi
    }
}
