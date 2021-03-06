package edu.nps.moves.dis7.entities.pak.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6c000e0c;
 * Country: Pakistan (PAK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19346
 */
public class CoastalTankersAOTL extends EntityType
{
    /** Default constructor */
    public CoastalTankersAOTL()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 19343, Auxiliary
        setSubCategory((byte)2); // uid 19346, Coastal Tankers (AOTL)
    }
}
