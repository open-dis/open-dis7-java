package edu.nps.moves.dis7.entities.nld.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@655a5d9c;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27945
 */
public class TMATContainer extends EntityType
{
    /** Default constructor */
    public TMATContainer()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 27942, Cargo Trailer
        setSubCategory((byte)3); // uid 27945, TMAT Container
    }
}
