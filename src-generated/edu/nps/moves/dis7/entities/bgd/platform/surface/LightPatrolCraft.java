package edu.nps.moves.dis7.entities.bgd.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@327471b5;
 * Country: Bangladesh (BGD);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32614
 */
public class LightPatrolCraft extends EntityType
{
    /** Default constructor */
    public LightPatrolCraft()
    {
        setCountry(Country.BANGLADESH_BGD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 32614, Light/Patrol Craft
    }
}
