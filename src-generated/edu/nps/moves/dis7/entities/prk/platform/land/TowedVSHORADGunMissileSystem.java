package edu.nps.moves.dis7.entities.prk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@89c10b7;
 * Country: Korea (Democratic Peoples Republic of) (PRK);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 23458
 */
public class TowedVSHORADGunMissileSystem extends EntityType
{
    /** Default constructor */
    public TowedVSHORADGunMissileSystem()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 23454, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)2); // uid 23458, Towed VSHORAD Gun/Missile System
    }
}
