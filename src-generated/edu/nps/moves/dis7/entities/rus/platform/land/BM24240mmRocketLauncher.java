package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@c3fa05a;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 12764
 */
public class BM24240mmRocketLauncher extends EntityType
{
    /** Default constructor */
    public BM24240mmRocketLauncher()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 12745, Self-Propelled Artillery
        setSubCategory((byte)15); // uid 12764, BM-24 240-mm Rocket Launcher
    }
}
