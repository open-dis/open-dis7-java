package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3f362135;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10208
 */
public class AAIPropulsionSystemDemonstratorAmphibiousAssaultVehicleAAV extends EntityType
{
    /** Default constructor */
    public AAIPropulsionSystemDemonstratorAmphibiousAssaultVehicleAAV()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 10067, Armored Fighting Vehicle
        setSubCategory((byte)24); // uid 10208, AAI Propulsion System Demonstrator Amphibious Assault Vehicle (AAV)
    }
}
