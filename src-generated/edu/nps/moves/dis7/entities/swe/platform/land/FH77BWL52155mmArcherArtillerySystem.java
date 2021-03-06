package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6ed16657;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27645
 */
public class FH77BWL52155mmArcherArtillerySystem extends EntityType
{
    /** Default constructor */
    public FH77BWL52155mmArcherArtillerySystem()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 17473, Self-Propelled Artillery
        setSubCategory((byte)3); // uid 27645, FH77BW L52 155mm Archer Artillery System
    }
}
