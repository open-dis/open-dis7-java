package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5b5ac798;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25572
 */
public class Flyer21LightStrikeVehicleLSV extends EntityType
{
    /** Default constructor */
    public Flyer21LightStrikeVehicleLSV()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 10348, Small Wheeled Utility Vehicle
        setSubCategory((byte)29); // uid 25572, Flyer 21 Light Strike Vehicle (LSV)
    }
}
