package edu.nps.moves.dis7.entities.pol.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1ad926d3;
 * Country: Poland (POL);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32566
 */
public class WR40Langusta122mmMRLS extends EntityType
{
    /** Default constructor */
    public WR40Langusta122mmMRLS()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 32565, Self-Propelled Artillery
        setSubCategory((byte)2); // uid 32566, WR-40 Langusta 122mm MRLS
    }
}
