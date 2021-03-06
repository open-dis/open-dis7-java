package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2cf3d63b;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16001
 */
public class M716Ceres extends EntityType
{
    /** Default constructor */
    public M716Ceres()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 15978, Mine Countermeasure Ship / Craft
        setSubCategory((byte)3); // uid 15996, Circe class (minehunters)
        setSpecific((byte)5); // uid 16001, M 716 Ceres
    }
}
