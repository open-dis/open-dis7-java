package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@f3021cb;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 14287
 */
public class PZHS96 extends EntityType
{
    /** Default constructor */
    public PZHS96()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)75); // uid 14286, Katun I class (salvage & rescue tugs)
        setSpecific((byte)1); // uid 14287, PZHS 96
    }
}
