package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5efe47fd;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24406
 */
public class TexacoGeorgia extends EntityType
{
    /** Default constructor */
    public TexacoGeorgia()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24404, Tanker (Group 3 Merchant)
        setSubCategory((byte)5); // uid 24405, Crude Oil Tanker (up to 159,999 DWT)
        setSpecific((byte)1); // uid 24406, Texaco Georgia
    }
}
