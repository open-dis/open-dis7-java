package edu.nps.moves.dis7.entities.can.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7a1ebcd8;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30968
 */
public class Moytel837340 extends EntityType
{
    /** Default constructor */
    public Moytel837340()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)62); // uid 26269, Coast Guard Cutters
        setSubCategory((byte)13); // uid 30966, Air Cushion Vehicle
        setSpecific((byte)2); // uid 30968, Moytel (837340)
    }
}
