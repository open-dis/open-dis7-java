package edu.nps.moves.dis7.entities.can.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3327bd23;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31026
 */
public class HLVWFuelTanker10000Liter extends EntityType
{
    /** Default constructor */
    public HLVWFuelTanker10000Liter()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 27893, Large Wheeled Utility Vehicle
        setSubCategory((byte)2); // uid 31021, Heavy Logistics Vehicle Wheeled (HLVW)
        setSpecific((byte)5); // uid 31026, HLVW Fuel Tanker 10000 Liter
    }
}
