package edu.nps.moves.dis7.entities.can.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6b09bb57;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29816
 */
public class CH124A extends EntityType
{
    /** Default constructor */
    public CH124A()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 18774, Anti-Submarine Warfare/Patrol Helicopter
        setSubCategory((byte)1); // uid 18775, CH-124 (HELO)
        setSpecific((byte)2); // uid 29816, CH-124A
    }
}
