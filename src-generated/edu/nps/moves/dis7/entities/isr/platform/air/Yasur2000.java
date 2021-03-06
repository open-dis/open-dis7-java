package edu.nps.moves.dis7.entities.isr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@35390ee3;
 * Country: Israel (ISR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 18201
 */
public class Yasur2000 extends EntityType
{
    /** Default constructor */
    public Yasur2000()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)23); // uid 18199, Cargo Helicopter
        setSubCategory((byte)1); // uid 18200, Israel Aircraft Industries Yasur 2000
        setSpecific((byte)1); // uid 18201, Yasur 2000
    }
}
