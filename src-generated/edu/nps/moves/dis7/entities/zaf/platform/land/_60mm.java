package edu.nps.moves.dis7.entities.zaf.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@534c6767
 * Country: South Africa (ZAF)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 19099
 */
public class _60mm extends EntityType
{
    public _60mm()
    {
        setCountry(Country.SOUTH_AFRICA_ZAF);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 19094, Armored Fighting Vehicle
        setSubCategory((byte)2); // uid 19097, Ratel
        setSpecific((byte)2); // uid 19099, 60 mm
    }
}
