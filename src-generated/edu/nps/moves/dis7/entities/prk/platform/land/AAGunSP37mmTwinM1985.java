package edu.nps.moves.dis7.entities.prk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@77192705;
 * Country: Korea (Democratic Peoples Republic of) (PRK);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 23457
 */
public class AAGunSP37mmTwinM1985 extends EntityType
{
    /** Default constructor */
    public AAGunSP37mmTwinM1985()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 23454, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 23455, Self-Propelled VSHORAD Gun/Missile System
        setSpecific((byte)2); // uid 23457, AA Gun, SP, 37mm Twin, M1985
    }
}
