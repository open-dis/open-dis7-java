package edu.nps.moves.dis7.entities.jpn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@40258c2f;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24788
 */
public class AttackHelicopter extends EntityType
{
    /** Default constructor */
    public AttackHelicopter()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)20); // uid 24788, Attack Helicopter
    }
}
