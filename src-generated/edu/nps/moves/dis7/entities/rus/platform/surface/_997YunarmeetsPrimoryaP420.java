package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@39ad12b6;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30414
 */
public class _997YunarmeetsPrimoryaP420 extends EntityType
{
    /** Default constructor */
    public _997YunarmeetsPrimoryaP420()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)118); // uid 30405, Grachonok Class (Project 21980) Anti-Saboteur Ship
        setSpecific((byte)9); // uid 30414, 997 Yunarmeets Primorya (P-420)
    }
}
