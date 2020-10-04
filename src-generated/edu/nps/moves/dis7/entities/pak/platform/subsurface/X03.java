package edu.nps.moves.dis7.entities.pak.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@78f9ed3e
 * Country: Pakistan (PAK)
 * Entity kind: Platform
 * Domain: SUBSURFACE
 *
 * Entity type uid: 27251
 */
public class X03 extends EntityType
{
    public X03()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)7); // uid 27247, SSA (Conventional Auxiliary)
        setSubCategory((byte)1); // uid 27248, MG110 / Cosmos Class
        setSpecific((byte)3); // uid 27251, X-03
    }
}