package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@13b13b5d;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15740
 */
public class F1DDA extends EntityType
{
    /** Default constructor */
    public F1DDA()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 15720, Fighter/Air Defense
        setSubCategory((byte)1); // uid 15721, Mirage F-1
        setSpecific((byte)19); // uid 15740, F1-DDA
    }
}
