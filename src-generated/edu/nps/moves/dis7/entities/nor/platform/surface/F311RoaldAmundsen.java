package edu.nps.moves.dis7.entities.nor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3d4d3fe7;
 * Country: Norway (NOR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27606
 */
public class F311RoaldAmundsen extends EntityType
{
    /** Default constructor */
    public F311RoaldAmundsen()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27603, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 27604, Fridtjof Nansen Class
        setSpecific((byte)2); // uid 27606, F311 Roald Amundsen
    }
}
