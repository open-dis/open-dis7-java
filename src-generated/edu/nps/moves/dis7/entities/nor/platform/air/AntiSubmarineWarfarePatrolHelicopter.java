package edu.nps.moves.dis7.entities.nor.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@1c807b1d
 * Country: Norway (NOR)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 29608
 */
public class AntiSubmarineWarfarePatrolHelicopter extends EntityType
{
    public AntiSubmarineWarfarePatrolHelicopter()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 29608, Anti-Submarine Warfare/Patrol Helicopter
    }
}
