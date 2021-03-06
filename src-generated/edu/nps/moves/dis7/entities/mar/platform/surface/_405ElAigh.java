package edu.nps.moves.dis7.entities.mar.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3a4b0e5d;
 * Country: Morocco (MAR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27730
 */
public class _405ElAigh extends EntityType
{
    /** Default constructor */
    public _405ElAigh()
    {
        setCountry(Country.MOROCCO_MAR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27726, Auxiliary
        setSubCategory((byte)2); // uid 27729, El Aigh Class
        setSpecific((byte)1); // uid 27730, 405 El Aigh
    }
}
