package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3a90c13c;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10271
 */
public class M270MultipleLaunchRocketSystemMLRS extends EntityType
{
    /** Default constructor */
    public M270MultipleLaunchRocketSystemMLRS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 10270, Self-Propelled Artillery
        setSubCategory((byte)1); // uid 10271, M270 Multiple Launch Rocket System (MLRS)
    }
}
