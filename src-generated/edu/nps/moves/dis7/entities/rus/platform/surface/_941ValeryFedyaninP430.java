package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@588307f7;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31322
 */
public class _941ValeryFedyaninP430 extends EntityType
{
    /** Default constructor */
    public _941ValeryFedyaninP430()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)118); // uid 30405, Grachonok Class (Project 21980) Anti-Saboteur Ship
        setSpecific((byte)15); // uid 31322, 941 Valery Fedyanin (P-430)
    }
}
