package edu.nps.moves.dis7.entities.zwe.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@340cb97f
 * Country: Zimbabwe (ZWE)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 28587
 */
public class Trainer extends EntityType
{
    public Trainer()
    {
        setCountry(Country.ZIMBABWE_ZWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 28587, Trainer
    }
}