package edu.nps.moves.dis7.entities.oth.radio.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1acc873b;
 * Country: Other;
 * Entity kind: Radio;
 * Domain: SURFACE;
 *
 * Entity type uid: 31912
 */
public class AISSARTRadio extends EntityType
{
    /** Default constructor */
    public AISSARTRadio()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)37); // uid 31910, Automatic Identification System (AIS)
        setSubCategory((byte)0); // uid 31911, Other
        setSpecific((byte)1); // uid 31912, AIS-SART Radio
    }
}
