package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@523a7801;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11469
 */
public class DD974ComteDeGrasse extends EntityType
{
    /** Default constructor */
    public DD974ComteDeGrasse()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 11456, Destroyer
        setSubCategory((byte)1); // uid 11457, Spruance Class
        setSpecific((byte)12); // uid 11469, DD 974 Comte De Grasse
    }
}
