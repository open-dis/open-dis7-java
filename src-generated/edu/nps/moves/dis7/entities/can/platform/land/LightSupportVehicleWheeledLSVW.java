package edu.nps.moves.dis7.entities.can.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3c0f93f1;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27895
 */
public class LightSupportVehicleWheeledLSVW extends EntityType
{
    /** Default constructor */
    public LightSupportVehicleWheeledLSVW()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 27893, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 27894, Western Star 40.10 WM
        setSpecific((byte)1); // uid 27895, Light Support Vehicle Wheeled (LSVW)
    }
}
