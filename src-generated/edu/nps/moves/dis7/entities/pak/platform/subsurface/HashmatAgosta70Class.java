package edu.nps.moves.dis7.entities.pak.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@75699e35
 * Country: Pakistan (PAK)
 * Entity kind: Platform
 * Domain: SUBSURFACE
 *
 * Entity type uid: 27239
 */
public class HashmatAgosta70Class extends EntityType
{
    public HashmatAgosta70Class()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 27234, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)2); // uid 27239, Hashmat / Agosta 70 Class
    }
}