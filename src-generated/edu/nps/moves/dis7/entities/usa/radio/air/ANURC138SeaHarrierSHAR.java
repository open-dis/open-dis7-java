package edu.nps.moves.dis7.entities.usa.radio.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3a8fb023;
 * Country: United States of America (USA);
 * Entity kind: Radio;
 * Domain: AIR;
 *
 * Entity type uid: 26808
 */
public class ANURC138SeaHarrierSHAR extends EntityType
{
    /** Default constructor */
    public ANURC138SeaHarrierSHAR()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 26798, Link 16 Terminal
        setSubCategory((byte)1); // uid 26799, Joint Electronics Type Designation System (JETDS) Non-specific Series
        setSpecific((byte)28); // uid 26808, AN/URC-138 Sea Harrier (SHAR)
    }
}
