package edu.nps.moves.dis7.entities.swe.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4ac86d6a;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 27289
 */
public class GotlandA19Class extends EntityType
{
    /** Default constructor */
    public GotlandA19Class()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 17502, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)4); // uid 27289, Gotland (A19) Class
    }
}
