package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@442d9b6e;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28624
 */
public class M113ASArmoredLogisticsVehicleFuelALVF extends EntityType
{
    /** Default constructor */
    public M113ASArmoredLogisticsVehicleFuelALVF()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 26906, Armored Utility Vehicle
        setSubCategory((byte)5); // uid 28622, M113-AS Armored Logistics Vehicle (Stores) (ALV-S)
        setSpecific((byte)2); // uid 28624, M113-AS Armored Logistics Vehicle (Fuel) (ALV-F)
    }
}
