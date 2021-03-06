package edu.nps.moves.dis7.entities.fra.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5c7933ad;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SPACE;
 *
 * Entity type uid: 16222
 */
public class ElectronicIntelligencesatellite extends EntityType
{
    /** Default constructor */
    public ElectronicIntelligencesatellite()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 16211, Unmanned
        setSubCategory((byte)4); // uid 16222, Electronic Intelligence satellite
    }
}
