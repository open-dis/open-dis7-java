package edu.nps.moves.dis7.entities.plw.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@21ae6e73;
 * Country: Palau (PLW);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26727
 */
public class LightPatrolCraft extends EntityType
{
    /** Default constructor */
    public LightPatrolCraft()
    {
        setCountry(Country.PALAU_PLW);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26727, Light/Patrol Craft
    }
}
