package edu.nps.moves.dis7.entities.nld.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@23c388c2;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28197
 */
public class AntiSubmarineWarfarePatrolHelicopter extends EntityType
{
    /** Default constructor */
    public AntiSubmarineWarfarePatrolHelicopter()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 28197, Anti-Submarine Warfare/Patrol Helicopter
    }
}
