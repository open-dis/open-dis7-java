package edu.nps.moves.dis7.entities.nld.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@241a53ef;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 23287
 */
public class S810Bruinvis extends EntityType
{
    /** Default constructor */
    public S810Bruinvis()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18948, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)1); // uid 18949, Walrus Class
        setSpecific((byte)4); // uid 23287, S810 Bruinvis
    }
}
