package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@16e7dcfd
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17174
 */
public class HaiqingType0371ClassFastAttackCraftPatrolPC710 extends EntityType
{
    public HaiqingType0371ClassFastAttackCraftPatrolPC710()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17120, Light/Patrol Craft
        setSubCategory((byte)11); // uid 17173, Haiqing (Type 037/1) Class (Fast Attack Craft-Patrol)(PC)
        setSpecific((byte)1); // uid 17174, 710
    }
}
