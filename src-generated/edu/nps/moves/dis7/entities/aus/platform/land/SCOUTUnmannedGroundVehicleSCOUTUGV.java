package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6073f712;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31306
 */
public class SCOUTUnmannedGroundVehicleSCOUTUGV extends EntityType
{
    /** Default constructor */
    public SCOUTUnmannedGroundVehicleSCOUTUGV()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)50); // uid 31300, Unmanned
        setSubCategory((byte)2); // uid 31306, SCOUT Unmanned Ground Vehicle (SCOUT UGV)
    }
}
