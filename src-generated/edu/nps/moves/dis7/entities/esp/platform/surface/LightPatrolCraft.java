package edu.nps.moves.dis7.entities.esp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@4d3ca6c7;
 * Country: Spain (ESP);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19011
 */
public class LightPatrolCraft extends EntityType
{
    /** Default constructor */
    public LightPatrolCraft()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 19011, Light/Patrol Craft
    }
}
