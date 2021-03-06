package edu.nps.moves.dis7.entities.cok.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@245b4bdc;
 * Country: Cook Islands (COK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26735
 */
public class LightPatrolCraft extends EntityType
{
    /** Default constructor */
    public LightPatrolCraft()
    {
        setCountry(Country.CREATE_ENTITY_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26735, Light/Patrol Craft
    }
}
