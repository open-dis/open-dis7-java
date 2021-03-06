package edu.nps.moves.dis7.entities.che.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@476fe690;
 * Country: Switzerland (CHE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 19051
 */
public class PC7MkII extends EntityType
{
    /** Default constructor */
    public PC7MkII()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 19048, Trainer
        setSubCategory((byte)1); // uid 19049, Pilatus PC-7
        setSpecific((byte)2); // uid 19051, PC-7 Mk II
    }
}
