package edu.nps.moves.dis7.entities.fra.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3feb2dda;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SPACE;
 *
 * Entity type uid: 16236
 */
public class Stella extends EntityType
{
    /** Default constructor */
    public Stella()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 16211, Unmanned
        setSubCategory((byte)14); // uid 16235, Survey satellite
        setSpecific((byte)1); // uid 16236, Stella
    }
}
