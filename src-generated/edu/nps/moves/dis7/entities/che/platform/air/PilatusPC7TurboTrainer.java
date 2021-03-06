package edu.nps.moves.dis7.entities.che.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@255eaa6b;
 * Country: Switzerland (CHE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 19050
 */
public class PilatusPC7TurboTrainer extends EntityType
{
    /** Default constructor */
    public PilatusPC7TurboTrainer()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 19048, Trainer
        setSubCategory((byte)1); // uid 19049, Pilatus PC-7
        setSpecific((byte)1); // uid 19050, Pilatus PC-7 Turbo Trainer
    }
}
