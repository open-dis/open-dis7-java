package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4567e53d;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 13481
 */
public class Tu134UBLbomberpilot extends EntityType
{
    /** Default constructor */
    public Tu134UBLbomberpilot()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 13479, Trainer
        setSubCategory((byte)1); // uid 13480, Tu-134 Crusty
        setSpecific((byte)1); // uid 13481, Tu-134UBL (bomber pilot)
    }
}
