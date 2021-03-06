package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@27fe059d;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11321
 */
public class AGF11Coronado extends EntityType
{
    /** Default constructor */
    public AGF11Coronado()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)2); // uid 11316, Command Ship/Cruiser
        setSubCategory((byte)2); // uid 11320, Raleigh and Austin Classes
        setSpecific((byte)1); // uid 11321, AGF 11 Coronado
    }
}
