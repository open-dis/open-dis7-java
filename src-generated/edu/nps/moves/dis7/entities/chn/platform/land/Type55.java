package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@517cd4b
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 16961
 */
public class Type55 extends EntityType
{
    public Type55()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16937, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)5); // uid 16958, Towed VSHORAD Gun/Missile System
        setSpecific((byte)2); // uid 16960, NORINCO 37mm AA Guns
        setExtra((byte)1); // uid 16961, Type 55
    }
}
