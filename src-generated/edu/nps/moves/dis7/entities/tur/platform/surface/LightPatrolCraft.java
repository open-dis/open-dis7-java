package edu.nps.moves.dis7.entities.tur.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@44cffc25;
 * Country: Turkey (TUR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19062
 */
public class LightPatrolCraft extends EntityType
{
    /** Default constructor */
    public LightPatrolCraft()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 19062, Light/Patrol Craft
    }
}
