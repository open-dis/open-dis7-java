package edu.nps.moves.dis7.entities.zwe.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@46a123e4;
 * Country: Zimbabwe (ZWE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28590
 */
public class Hawk60A extends EntityType
{
    /** Default constructor */
    public Hawk60A()
    {
        setCountry(Country.ZIMBABWE_ZWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 28587, Trainer
        setSubCategory((byte)1); // uid 28588, BAE Systems Hawk
        setSpecific((byte)2); // uid 28590, Hawk 60A
    }
}
