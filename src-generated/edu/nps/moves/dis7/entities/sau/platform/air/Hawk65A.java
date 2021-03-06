package edu.nps.moves.dis7.entities.sau.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@55a88417;
 * Country: Saudi Arabia (SAU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28571
 */
public class Hawk65A extends EntityType
{
    /** Default constructor */
    public Hawk65A()
    {
        setCountry(Country.SAUDI_ARABIA_SAU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 17845, Trainer
        setSubCategory((byte)2); // uid 28569, BAE Systems Hawk
        setSpecific((byte)2); // uid 28571, Hawk 65A
    }
}
