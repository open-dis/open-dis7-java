package edu.nps.moves.dis7.entities.swe.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4760f169;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 27287
 */
public class SodermanlandSod extends EntityType
{
    /** Default constructor */
    public SodermanlandSod()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 17502, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)3); // uid 27286, Sodermanland (A17 Modified) Class
        setSpecific((byte)1); // uid 27287, Sodermanland (Sod)
    }
}
