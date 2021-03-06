package edu.nps.moves.dis7.entities.prk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7fcbe147;
 * Country: Korea (Democratic Peoples Republic of) (PRK);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 17755
 */
public class M1985 extends EntityType
{
    /** Default constructor */
    public M1985()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 17750, Self-Propelled Artillery
        setSubCategory((byte)2); // uid 17754, 240 mm Rocket Launcher
        setSpecific((byte)1); // uid 17755, M-1985
    }
}
