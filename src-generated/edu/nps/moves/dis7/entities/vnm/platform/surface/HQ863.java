package edu.nps.moves.dis7.entities.vnm.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f85ee02;
 * Country: Viet Nam (VNM);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29966
 */
public class HQ863 extends EntityType
{
    /** Default constructor */
    public HQ863()
    {
        setCountry(Country.VIET_NAM_VNM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 29962, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 29963, Sonya Class
        setSpecific((byte)3); // uid 29966, HQ-863
    }
}
