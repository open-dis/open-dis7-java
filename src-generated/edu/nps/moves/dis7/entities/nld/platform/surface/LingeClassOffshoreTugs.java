package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6bc28a83;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28258
 */
public class LingeClassOffshoreTugs extends EntityType
{
    /** Default constructor */
    public LingeClassOffshoreTugs()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18942, Auxiliary
        setSubCategory((byte)6); // uid 28258, Linge Class (Off-shore Tugs)
    }
}
