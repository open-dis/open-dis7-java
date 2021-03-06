package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5c671d7f;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 15662
 */
public class AMX10ECHRecoveryVehicle extends EntityType
{
    /** Default constructor */
    public AMX10ECHRecoveryVehicle()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 15661, Armored Utility Vehicle
        setSubCategory((byte)1); // uid 15662, AMX-10 ECH Recovery Vehicle
    }
}
