package edu.nps.moves.dis7.entities.nld.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3deb2326;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27929
 */
public class Leopard1VBRVBeachRecoveryVehicle extends EntityType
{
    /** Default constructor */
    public Leopard1VBRVBeachRecoveryVehicle()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 27928, Armored Utility Vehicle
        setSubCategory((byte)1); // uid 27929, Leopard 1V BRV (Beach Recovery Vehicle)
    }
}
