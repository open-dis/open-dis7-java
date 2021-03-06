package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@13d4992d;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16592
 */
public class Mannheim59classriverlandingcraftLCMs extends EntityType
{
    /** Default constructor */
    public Mannheim59classriverlandingcraftLCMs()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 16562, Landing Craft
        setSubCategory((byte)3); // uid 16592, Mannheim 59 class (river landing craft, LCMs)
    }
}
