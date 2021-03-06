package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5891e32e;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31853
 */
public class Type05AmphibiousFightingVehicleAFV1 extends EntityType
{
    /** Default constructor */
    public Type05AmphibiousFightingVehicleAFV1()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 16876, Armored Fighting Vehicle
        setSubCategory((byte)8); // uid 31853, Type 05 Amphibious Fighting Vehicle (AFV)
    }
}
