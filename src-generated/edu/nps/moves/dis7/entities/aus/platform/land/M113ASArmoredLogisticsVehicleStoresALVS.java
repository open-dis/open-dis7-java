package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@ee7d9f1;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28622
 */
public class M113ASArmoredLogisticsVehicleStoresALVS extends EntityType
{
    /** Default constructor */
    public M113ASArmoredLogisticsVehicleStoresALVS()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 26906, Armored Utility Vehicle
        setSubCategory((byte)5); // uid 28622, M113-AS Armored Logistics Vehicle (Stores) (ALV-S)
    }
}
