package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@314ed053
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 13599
 */
public class Deyatelny extends EntityType
{
    public Deyatelny()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 13593, Guided-missile Frigate (includes Corvette)
        setSubCategory((byte)1); // uid 13594, Krivak I class
        setSpecific((byte)5); // uid 13599, Deyatelny
    }
}
