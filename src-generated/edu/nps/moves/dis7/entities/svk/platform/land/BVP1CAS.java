package edu.nps.moves.dis7.entities.svk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@52169758;
 * Country: Slovakia (SVK);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 30115
 */
public class BVP1CAS extends EntityType
{
    /** Default constructor */
    public BVP1CAS()
    {
        setCountry(Country.SLOVAKIA_SVK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 30111, Armored Utility Vehicle
        setSubCategory((byte)4); // uid 30115, BVP-1CAS
    }
}
