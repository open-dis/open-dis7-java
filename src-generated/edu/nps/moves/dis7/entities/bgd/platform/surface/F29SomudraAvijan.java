package edu.nps.moves.dis7.entities.bgd.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6b143ee9;
 * Country: Bangladesh (BGD);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32623
 */
public class F29SomudraAvijan extends EntityType
{
    /** Default constructor */
    public F29SomudraAvijan()
    {
        setCountry(Country.BANGLADESH_BGD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 32620, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 32621, Hamilton Class
        setSpecific((byte)2); // uid 32623, F29 Somudra Avijan
    }
}
