package edu.nps.moves.dis7.entities.dnk.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6c6cb480
 * Country: Denmark (DNK)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 25519
 */
public class AntiSubmarineWarfarePatrolHelicopter extends EntityType
{
    public AntiSubmarineWarfarePatrolHelicopter()
    {
        setCountry(Country.DENMARK_DNK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 25519, Anti-Submarine Warfare/Patrol Helicopter
    }
}