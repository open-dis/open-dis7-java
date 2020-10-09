package edu.nps.moves.dis7.entities.idn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@736caf7a
 * Country: Indonesia (IDN)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 28541
 */
public class Hawk209 extends EntityType
{
    public Hawk209()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 28539, Attack/Strike
        setSubCategory((byte)1); // uid 28540, BAE Systems Hawk
        setSpecific((byte)1); // uid 28541, Hawk 209
    }
}
