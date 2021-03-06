package edu.nps.moves.dis7.entities.bra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6ea12c19;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32036
 */
public class LeopardArmouredEngineerVehicleAEV extends EntityType
{
    /** Default constructor */
    public LeopardArmouredEngineerVehicleAEV()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 32035, Armored Utility Vehicle
        setSubCategory((byte)1); // uid 32036, Leopard Armoured Engineer Vehicle (AEV)
    }
}
