package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@62fad19;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24883
 */
public class ToyotaTechTruckw127mmMG extends EntityType
{
    /** Default constructor */
    public ToyotaTechTruckw127mmMG()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24879, Single Unit Cargo Truck
        setSubCategory((byte)1); // uid 24880, Pickup Truck, Mini
        setSpecific((byte)1); // uid 24881, Toyota Mini Pickup
        setExtra((byte)2); // uid 24883, Toyota Tech Truck w/ 12.7mm MG
    }
}
