package edu.nps.moves.dis7.entities.can.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2ac273d3;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 30990
 */
public class CF188B extends EntityType
{
    /** Default constructor */
    public CF188B()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 30987, Fighter/Air Defense
        setSubCategory((byte)1); // uid 30988, McDonnell Douglas CF-18 Hornet
        setSpecific((byte)2); // uid 30990, CF-188 B
    }
}
