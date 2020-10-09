package edu.nps.moves.dis7.entities.kor.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@2416a51
 * Country: Korea (Republic of) (KOR)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 23869
 */
public class CivilianFixedWingAircraftSmallupto12500lbs5670kg extends EntityType
{
    public CivilianFixedWingAircraftSmallupto12500lbs5670kg()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)85); // uid 23869, Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg)
    }
}
