package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@65a4798f;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31824
 */
public class ToyotaTechTruckw82mmMortar extends EntityType
{
    /** Default constructor */
    public ToyotaTechTruckw82mmMortar()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24879, Single Unit Cargo Truck
        setSubCategory((byte)1); // uid 24880, Pickup Truck, Mini
        setSpecific((byte)1); // uid 24881, Toyota Mini Pickup
        setExtra((byte)9); // uid 31824, Toyota Tech Truck w/ 82mm Mortar
    }
}
