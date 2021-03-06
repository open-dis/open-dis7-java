package edu.nps.moves.dis7.entities.syr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5bc28f40;
 * Country: Syrian Arab Republic (SYR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29955
 */
public class SonyaClass extends EntityType
{
    /** Default constructor */
    public SonyaClass()
    {
        setCountry(Country.SYRIAN_ARAB_REPUBLIC_SYR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 29954, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 29955, Sonya Class
    }
}
