package edu.nps.moves.dis7.entities.prk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@533b266e
 * Country: Korea (Democratic Peoples Republic of) (PRK)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 23536
 */
public class AAGunSP145mmTwinM1985 extends EntityType
{
    public AAGunSP145mmTwinM1985()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 23454, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 23455, Self-Propelled VSHORAD Gun/Missile System
        setSpecific((byte)4); // uid 23536, AA Gun, SP, 14.5mm Twin, M1985
    }
}