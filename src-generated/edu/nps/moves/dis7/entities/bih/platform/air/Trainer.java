package edu.nps.moves.dis7.entities.bih.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6276ae34;
 * Country: Bosnia and Herzegovina (BIH);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 25412
 */
public class Trainer extends EntityType
{
    /** Default constructor */
    public Trainer()
    {
        setCountry(Country.BOSNIA_AND_HERZEGOVINA_BIH);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 25412, Trainer
    }
}
