package edu.nps.moves.dis7.entities.prk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@4a9f80d3;
 * Country: Korea (Democratic Peoples Republic of) (PRK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17796
 */
public class LandingCraft extends EntityType
{
    /** Default constructor */
    public LandingCraft()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 17796, Landing Craft
    }
}
