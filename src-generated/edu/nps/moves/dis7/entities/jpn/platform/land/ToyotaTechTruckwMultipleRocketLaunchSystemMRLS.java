package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@878452d;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31826
 */
public class ToyotaTechTruckwMultipleRocketLaunchSystemMRLS extends EntityType
{
    /** Default constructor */
    public ToyotaTechTruckwMultipleRocketLaunchSystemMRLS()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24879, Single Unit Cargo Truck
        setSubCategory((byte)1); // uid 24880, Pickup Truck, Mini
        setSpecific((byte)1); // uid 24881, Toyota Mini Pickup
        setExtra((byte)11); // uid 31826, Toyota Tech Truck w/ Multiple Rocket Launch System (MRLS)
    }
}
