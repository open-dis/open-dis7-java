package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6f49d153
 * Country: Sweden (SWE)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 27658
 */
public class AllTerrainVehicleProtectedATVPVikingBvS10 extends EntityType
{
    public AllTerrainVehicleProtectedATVPVikingBvS10()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 27646, Large Tracked Utility Vehicle
        setSubCategory((byte)4); // uid 27658, All Terrain Vehicle (Protected) / ATV(P) / Viking / BvS 10
    }
}
