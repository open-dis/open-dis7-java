package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@30cecdca;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 12934
 */
public class LBU200mobilewelldrillingequipment extends EntityType
{
    /** Default constructor */
    public LBU200mobilewelldrillingequipment()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 12867, Large Wheeled Utility Vehicle
        setSubCategory((byte)37); // uid 12934, LBU-200 mobile well-drilling equipment
    }
}
