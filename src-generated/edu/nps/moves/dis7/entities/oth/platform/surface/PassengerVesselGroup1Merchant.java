package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@4fbb001b;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24613
 */
public class PassengerVesselGroup1Merchant extends EntityType
{
    /** Default constructor */
    public PassengerVesselGroup1Merchant()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)80); // uid 24613, Passenger Vessel (Group 1 Merchant)
    }
}
