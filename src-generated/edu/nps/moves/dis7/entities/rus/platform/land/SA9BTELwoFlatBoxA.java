package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4d23015c
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 13116
 */
public class SA9BTELwoFlatBoxA extends EntityType
{
    public SA9BTELwoFlatBoxA()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)12); // uid 13112, Self-Propelled VSHORAD Gun/Missile System
        setSpecific((byte)2); // uid 13114, SA-9 Gaskin SAM System
        setExtra((byte)2); // uid 13116, SA-9B TEL (w/o Flat Box-A)
    }
}
