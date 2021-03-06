package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@f9cab00;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 22997
 */
public class WaterTank4750galSMFT5K extends EntityType
{
    /** Default constructor */
    public WaterTank4750galSMFT5K()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)18); // uid 10638, Engineer Equipment
        setSubCategory((byte)11); // uid 22997, Water Tank, 4750 gal, SMFT-5K
    }
}
