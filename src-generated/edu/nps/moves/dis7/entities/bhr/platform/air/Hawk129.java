package edu.nps.moves.dis7.entities.bhr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6b2fad11;
 * Country: Bahrain (BHR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28526
 */
public class Hawk129 extends EntityType
{
    /** Default constructor */
    public Hawk129()
    {
        setCountry(Country.BAHRAIN_BHR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 28524, Trainer
        setSubCategory((byte)1); // uid 28525, BAE Systems Hawk
        setSpecific((byte)1); // uid 28526, Hawk 129
    }
}
