package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@41975e01;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28914
 */
public class SingleCabPanelVan extends EntityType
{
    /** Default constructor */
    public SingleCabPanelVan()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 28910, Small Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 28911, G-Wagon 4x4
        setSpecific((byte)3); // uid 28914, Single Cab Panel Van
    }
}
