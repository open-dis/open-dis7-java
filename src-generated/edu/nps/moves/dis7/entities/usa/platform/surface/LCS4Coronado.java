package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5c931134;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26927
 */
public class LCS4Coronado extends EntityType
{
    /** Default constructor */
    public LCS4Coronado()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)20); // uid 26921, Littoral Combat Ships (LCS)
        setSubCategory((byte)2); // uid 26923, LCS Independence Class
        setSpecific((byte)2); // uid 26927, LCS 4 Coronado
    }
}
