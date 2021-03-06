package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1a5b8489;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 12853
 */
public class _140mm16roundRPU14multiplerocketsystem extends EntityType
{
    /** Default constructor */
    public _140mm16roundRPU14multiplerocketsystem()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 12810, Towed artillery
        setSubCategory((byte)39); // uid 12853, 140-mm 16-round RPU-14 multiple rocket system
    }
}
