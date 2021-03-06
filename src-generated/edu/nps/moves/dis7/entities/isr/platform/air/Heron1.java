package edu.nps.moves.dis7.entities.isr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5e8ac0e1;
 * Country: Israel (ISR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24222
 */
public class Heron1 extends EntityType
{
    /** Default constructor */
    public Heron1()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 23487, Unmanned
        setSubCategory((byte)5); // uid 24221, IAI Heron UAV Family
        setSpecific((byte)1); // uid 24222, Heron 1
    }
}
