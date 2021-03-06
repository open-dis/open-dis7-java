package edu.nps.moves.dis7.entities.zwe.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7d3691e1;
 * Country: Zimbabwe (ZWE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28589
 */
public class Hawk60 extends EntityType
{
    /** Default constructor */
    public Hawk60()
    {
        setCountry(Country.ZIMBABWE_ZWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 28587, Trainer
        setSubCategory((byte)1); // uid 28588, BAE Systems Hawk
        setSpecific((byte)1); // uid 28589, Hawk 60
    }
}
