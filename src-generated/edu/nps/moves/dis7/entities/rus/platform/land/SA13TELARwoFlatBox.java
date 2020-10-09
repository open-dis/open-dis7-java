package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@73a00e09
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 13119
 */
public class SA13TELARwoFlatBox extends EntityType
{
    public SA13TELARwoFlatBox()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)12); // uid 13112, Self-Propelled VSHORAD Gun/Missile System
        setSpecific((byte)3); // uid 13117, SA-13 Gopher SAM System
        setExtra((byte)2); // uid 13119, SA-13 TELAR w/o Flat Box
    }
}
