package edu.nps.moves.dis7.entities.can.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a7e666;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31000
 */
public class KingstonMM700 extends EntityType
{
    /** Default constructor */
    public KingstonMM700()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 30998, Light/Patrol Craft
        setSubCategory((byte)1); // uid 30999, Kingston Class Maritime Coastal Defence Vessel
        setSpecific((byte)1); // uid 31000, Kingston (MM 700)
    }
}
