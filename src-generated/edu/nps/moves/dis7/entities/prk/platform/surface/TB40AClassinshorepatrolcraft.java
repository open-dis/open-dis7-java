package edu.nps.moves.dis7.entities.prk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2a65bb85;
 * Country: Korea (Democratic Peoples Republic of) (PRK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17786
 */
public class TB40AClassinshorepatrolcraft extends EntityType
{
    /** Default constructor */
    public TB40AClassinshorepatrolcraft()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17768, Light/patrol Craft
        setSubCategory((byte)17); // uid 17786, TB 40A Class (inshore patrol craft)
    }
}
