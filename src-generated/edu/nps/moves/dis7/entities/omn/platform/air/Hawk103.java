package edu.nps.moves.dis7.entities.omn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3caa4757;
 * Country: Oman (OMN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28567
 */
public class Hawk103 extends EntityType
{
    /** Default constructor */
    public Hawk103()
    {
        setCountry(Country.OMAN_OMN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 28565, Trainer
        setSubCategory((byte)1); // uid 28566, BAE Systems Hawk
        setSpecific((byte)1); // uid 28567, Hawk 103
    }
}
