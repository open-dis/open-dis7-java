package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@673fdbce;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 16182
 */
public class S612Leterrible extends EntityType
{
    /** Default constructor */
    public S612Leterrible()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)2); // uid 16179, SSGN (Nuclear Guided Missile)
        setSubCategory((byte)1); // uid 16180, Linflexible class (SNLE)
        setSpecific((byte)2); // uid 16182, S 612 Le terrible
    }
}
