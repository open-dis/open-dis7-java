package edu.nps.moves.dis7.entities.irn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2dd29a59;
 * Country: Iran (Islamic Republic of) (IRN);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 30892
 */
public class NahangClass extends EntityType
{
    /** Default constructor */
    public NahangClass()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)12); // uid 30889, SSM (Midget Submarine, under 150 tons)
        setSubCategory((byte)3); // uid 30892, Nahang Class
    }
}
