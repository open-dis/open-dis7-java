package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3646a422;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 15969
 */
public class P687Lagracieuse extends EntityType
{
    /** Default constructor */
    public P687Lagracieuse()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 15962, Light/patrol craft
        setSubCategory((byte)1); // uid 15963, P 400 class (fast attack craft--patrol)
        setSpecific((byte)6); // uid 15969, P 687 La gracieuse
    }
}
