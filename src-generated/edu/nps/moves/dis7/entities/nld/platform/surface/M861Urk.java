package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@615f972
 * Country: Netherlands (NLD)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 23296
 */
public class M861Urk extends EntityType
{
    public M861Urk()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 23288, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 23289, Alkmaar Class
        setSpecific((byte)7); // uid 23296, M861 Urk
    }
}
