package edu.nps.moves.dis7.entities.vnm.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6c075e9d;
 * Country: Viet Nam (VNM);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29963
 */
public class SonyaClass extends EntityType
{
    /** Default constructor */
    public SonyaClass()
    {
        setCountry(Country.VIET_NAM_VNM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 29962, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 29963, Sonya Class
    }
}
