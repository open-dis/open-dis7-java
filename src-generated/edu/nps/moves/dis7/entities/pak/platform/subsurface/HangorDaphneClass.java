package edu.nps.moves.dis7.entities.pak.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2c383e33;
 * Country: Pakistan (PAK);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 27242
 */
public class HangorDaphneClass extends EntityType
{
    /** Default constructor */
    public HangorDaphneClass()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 27234, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)3); // uid 27242, Hangor / Daphne Class
    }
}
