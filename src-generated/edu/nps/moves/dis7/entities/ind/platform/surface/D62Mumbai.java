package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b7c473a;
 * Country: India (IND);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23159
 */
public class D62Mumbai extends EntityType
{
    /** Default constructor */
    public D62Mumbai()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 18824, Guided Missile Destroyer (DDG)
        setSubCategory((byte)1); // uid 18825, Delhi Class
        setSpecific((byte)3); // uid 23159, D62 Mumbai
    }
}
