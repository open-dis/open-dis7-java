package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5e3a39cd;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 12916
 */
public class ZIL1336x48000kgtruck extends EntityType
{
    /** Default constructor */
    public ZIL1336x48000kgtruck()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 12867, Large Wheeled Utility Vehicle
        setSubCategory((byte)19); // uid 12916, ZIL-133 6x4 8000 kg-truck
    }
}
