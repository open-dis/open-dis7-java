package edu.nps.moves.dis7.entities.bgd.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3a03464;
 * Country: Bangladesh (BGD);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32627
 */
public class PL72Tajuddin extends EntityType
{
    /** Default constructor */
    public PL72Tajuddin()
    {
        setCountry(Country.BANGLADESH_BGD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)63); // uid 32624, Coast Guard Boats
        setSubCategory((byte)1); // uid 32625, Minerva Class
        setSpecific((byte)2); // uid 32627, PL72 Tajuddin
    }
}
