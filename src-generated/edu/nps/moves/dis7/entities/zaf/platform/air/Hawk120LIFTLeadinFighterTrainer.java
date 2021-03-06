package edu.nps.moves.dis7.entities.zaf.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6a0094c9;
 * Country: South Africa (ZAF);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28575
 */
public class Hawk120LIFTLeadinFighterTrainer extends EntityType
{
    /** Default constructor */
    public Hawk120LIFTLeadinFighterTrainer()
    {
        setCountry(Country.SOUTH_AFRICA_ZAF);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 28573, Trainer
        setSubCategory((byte)1); // uid 28574, BAE Systems Hawk
        setSpecific((byte)1); // uid 28575, Hawk 120/LIFT (Lead-in Fighter Trainer)
    }
}
