package edu.nps.moves.dis7.entities.rou.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@127d7908;
 * Country: Romania (ROU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29195
 */
public class Trainer extends EntityType
{
    /** Default constructor */
    public Trainer()
    {
        setCountry(Country.ROMANIA_ROU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 29195, Trainer
    }
}
